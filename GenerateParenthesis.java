package Recursion;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=2;

        solve(n,n,"");
        solve(n,0,0,"");
    }

    private static void solve(int op,int cl, String ans) {

        if(op==0 && cl==0){
            System.out.println(ans);
            return;
        }



           if(op>0)
        solve(op-1,cl,ans+"(");


        if(op<cl)
        solve(op,cl-1,ans+")");

    }
    private static void solve(int n,int op,int cl, String ans) {

        if(op==n && cl==n){
            System.out.println(ans);
            return;
        }


             if(op<n)
            solve(n,op+1,cl,ans+"(");


        if(op>cl)
            solve(n,op,cl+1,ans+")");

    }
}
