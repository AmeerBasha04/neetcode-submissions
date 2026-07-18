class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String, List<String>> map = new HashMap<>();

        // for (String s : strs) {
        //     char[] ch = s.toCharArray();
        //     Arrays.sort(ch);
        //     String key = new String(ch);

        //     map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        // }

        // return new ArrayList<>(map.values());
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {

            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }

            StringBuilder builder = new StringBuilder();
            for (int i : freq) {
                builder.append(i).append("#");
            }

            map.computeIfAbsent(builder.toString(), k -> new ArrayList<>()).add(s);

        }

        return new ArrayList<>(map.values());
    }
}
