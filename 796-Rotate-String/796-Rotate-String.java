class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0;i<s.length();i++){
            s = s.substring(0,s.length()-1)+s.charAt(0);
            if(s == goal)
                return true;
        }
    return false;
    }
}
