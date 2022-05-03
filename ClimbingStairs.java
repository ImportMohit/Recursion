package Recursion;

public class ClimbingStairs {

    public static void main(String[] args) {
        int  n=5;

        solve(n,"");
    }

    private static void solve(int n, String ans) {
        if(n==0){
            System.out.println(ans);
            return;

        }

        if(n<0)
            return ;


        for(int i=1;i<=3;i++)
        solve(n-i,ans+i);


    }

}
