class Solution {
    public String reverseWords(String s) {

int beg = s.length();
int end = s.length();
String ans="";

        for(int i =s.length()-1; i>=0;i--){

            if(s.charAt(i)!=' '){
            beg--;
            }

            if (s.charAt(i)==' ' || i == 0){
                if(s.substring(beg,end)!=""){
                    ans = ans + s.substring(beg,end)+" ";
                }
                end = i;
                beg = i;
            }
        }
        return ans.substring(0,ans.length()-1);
    }
}
