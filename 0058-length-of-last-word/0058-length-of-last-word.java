class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        for(String i:s.split(" ")){
            length = i.length();
        }
        return length;
    }
}