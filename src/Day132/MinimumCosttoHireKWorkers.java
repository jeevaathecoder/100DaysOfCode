package Day132;

import java.util.*;

public class MinimumCosttoHireKWorkers {
    class Solution {
        public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
            int n = quality.length;
            double minCost = Double.MAX_VALUE;
            double qualityTillNow = 0;

            List<Worker> workers = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                workers.add(new Worker(wage[i] / (double) quality[i],
                        quality[i]));
            }


            Collections.sort(workers);

            // Max-heap for the qualities using a comparator
            PriorityQueue<Integer> highQualityWorkers = new PriorityQueue<>(Comparator.reverseOrder());

            for (Worker worker : workers) {
                double ratio = worker.ratio;
                int qua = worker.quality;

                qualityTillNow += qua;
                highQualityWorkers.add(qua);

                if (highQualityWorkers.size() > k) {
                    qualityTillNow -= highQualityWorkers.poll();
                }

                if (highQualityWorkers.size() == k) {
                    minCost = Math.min(minCost, qualityTillNow * ratio);
                }
            }

            return minCost;
        }

        // Helper class to store the ratio and quality and implement comparable for
        // sorting
        private class Worker implements Comparable<Worker> {
            double ratio;
            int quality;

            Worker(double ratio, int quality) {
                this.ratio = ratio;
                this.quality = quality;
            }

            @Override
            public int compareTo(Worker other) {
                return Double.compare(this.ratio, other.ratio);
            }
        }
    }
}
