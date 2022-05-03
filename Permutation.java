package Recursion;

public class Permutation {
    public static void main(String[] args) {
        String str="ABC";

        solve(str,"");

    }

    private static void solve(String ques, String ans) {

        if(ques.isEmpty())
        {
            System.out.println(ans);
            return;
        }


        for(int i=0;i<ques.length();i++){

            String restOfQuestion=ques.substring(0,i)+ques.substring(i+1);

            solve(restOfQuestion,ans+ques.charAt(i));
        }


    }




}
