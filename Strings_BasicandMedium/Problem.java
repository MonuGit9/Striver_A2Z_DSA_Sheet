class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        int n = strs.length-1;
        String ans = "";

        for(int i = 0;i<Math.min(strs[0].length(), strs[n].length());i++){

        if(strs[0].charAt(i)!=strs[n].charAt(i)){
            return ans;
        }
        ans = ans + strs[0].charAt(i);
        }
    
    return ans;
    }
}
