package Recursion;

import java.util.Queue;

public class SpacePartitioning {
    public static void main(String[] args) {
        String str="abc";

        solve(str,"");


    }

    private static void solve(String ques, String ans) {

        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=ques.length();i++)
            solve(ques.substring(i),ans+ques.substring(0,i)+" ");



    }
}
