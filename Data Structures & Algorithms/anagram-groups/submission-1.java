class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { 

        HashMap<String, List<String>> groups = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String a = strs[i];

            char[] c1 = a.toCharArray();

            Arrays.sort(c1);

            String key = new String(c1);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
                
            }

            groups.get(key).add(strs[i]);
           
        }

        return new ArrayList<>(groups.values());

    }
}
