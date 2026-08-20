class Solution {
    public int strStr(String haystack, String needle) {
        return firstOccurrance(haystack,needle,0);
    }

    int firstOccurrance(String haystack, String needle,int index){
        if(haystack.isEmpty())
            return -1;

        if(haystack.startsWith(needle))
            return index;

        return firstOccurrance(haystack.substring(1),needle,index + 1);

    }
}
