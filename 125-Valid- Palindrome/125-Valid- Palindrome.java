class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder text = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                text.append(c);
            }
        }
        int n = text.length();
        for(int i=0; i < n/2;i++){
            if(text.charAt(i) != text.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
