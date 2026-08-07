class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        else{
            char[] array1 = s.toLowerCase().toCharArray();
            char[] array2 = t.toLowerCase().toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);
            
            return Arrays.equals(array1,array2);

        }

    }
}
