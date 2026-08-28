class Solution {
    public String reorganizeString(String s) {
        // 1. Frequency count
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        while (!map.isEmpty()) {

            // 2. Frequency ke according descending sort
            List<Map.Entry<Character, Integer>> list =
                    new ArrayList<>(map.entrySet());

            list.sort((a, b) -> b.getValue() - a.getValue());

            // 3. Highest frequency wala
            char first = list.get(0).getKey();

            // Agar previous same hai, second highest lena padega
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == first) {

                if (list.size() == 1) {
                    return "";
                }

                char second = list.get(1).getKey();

                ans.append(second);

                map.put(second, map.get(second) - 1);

                if (map.get(second) == 0) {
                    map.remove(second);
                }

            } else {
                ans.append(first);

                map.put(first, map.get(first) - 1);

                if (map.get(first) == 0) {
                    map.remove(first);
                }
            }
        }

        return ans.toString();
    }
}