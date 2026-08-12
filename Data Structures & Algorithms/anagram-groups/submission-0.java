public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            // first we are sorting the string
            Arrays.sort(charArray);
            // we again converted to string so we cross check in mapo
            String sortedS = new String(charArray);
            // this ewill add if not present
            res.putIfAbsent(sortedS, new ArrayList<>());
            // this will add the valuex in key of array 
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}