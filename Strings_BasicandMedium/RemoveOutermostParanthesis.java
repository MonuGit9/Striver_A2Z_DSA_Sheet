package Strings_BasicAndMedium;

public class RemoveOutermostParanthesis {

        public String removeOuterParentheses(String s) {

            int left = 0;
            int right = 0;
            String ans = "";
            int j =1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    left++;
                } else {
                    right++;
                }
                if(left==right){
                    ans = ans.concat(s.substring(j,i));
                    left = 0;
                    right = 0;
                    j=i+2;
                }
            }
            return ans;
        }
    }

