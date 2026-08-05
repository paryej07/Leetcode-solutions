class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        for(String i:s.split(" ")){
            len = i.length();
        }
        return len;
    }
}
