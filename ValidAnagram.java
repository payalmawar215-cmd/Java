class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            char[] array=s.toCharArray();
            char[] array1=t.toCharArray();
            Arrays.sort(array);
            Arrays.sort(array1);
            if(Arrays.equals(array,array1)){
                return true;
            }else{
                return false;
            }
        }
}
}
