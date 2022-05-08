package Recursion;

public class PalindromePartioning {
    public static void main(String[] args) {

        String str="aab";
        solve(str,"");

    }
    private static void solve(String ques, String ans) {

        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }




        for(int i=1;i<=ques.length();i++) {


            String roq=ques.substring(i);
            String roa=ques.substring(0,i);


            if (isPalindrome(roa, 0, i - 1))
                solve(roq, ans + roa + " ");
        }


    }

    private static boolean isPalindrome(String str,int s,int e) {
        if(s>=e)
            return true;





        if(str.charAt(s)==str.charAt(e) && isPalindrome(str,s+1,e-1))
             return  true;

        return false;





    }
}
