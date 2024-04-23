//package Day113;
////https://leetcode.com/problems/open-the-lock/
////https://leetcode.com/problems/open-the-lock/
//public class OpentheLock {
//    class Solution {
//        public int openLock(String[] deadends, String target) {
//            Set<String> deadendsSet = new HashSet<>(Arrays.asList(deadends));
//            if (deadendsSet.contains("0000")) {
//                return -1;
//            }
//
//            Set<String> visited = new HashSet<>();
//            Queue<String> queue = new LinkedList<>();
//            queue.add("0000");
//            visited.add("0000");
//
//            int turns = 0;
//
//            while (!queue.isEmpty()) {
//                int levelSize = queue.size();
//                for (int i = 0; i < levelSize; i++) {
//                    String current = queue.poll();
//
//                    if (current.equals(target)) {
//                        return turns;
//                    }
//
//                    for (String comb : getCombinations(current)) {
//                        if (!deadendsSet.contains(comb) && !visited.contains(comb)) {
//                            queue.add(comb);
//                            visited.add(comb);
//                        }
//                    }
//
//                }
//                turns++;
//            }
//
//            return -1;
//        }
//
//        private List<String> getCombinations(String s) {
//            List<String> neighbors = new ArrayList<>();
//            for (int i = 0; i < 4; i++) {
//                char[] chars = s.toCharArray();
//
//                chars[i] = (char) (((chars[i] - '0' + 1) % 10) + '0');
//                neighbors.add(new String(chars));
//
//                chars[i] = (char) (((chars[i] - '0' + 8) % 10) + '0');
//                neighbors.add(new String(chars));
//            }
//            return neighbors;
//        }
//
//    }
//}
