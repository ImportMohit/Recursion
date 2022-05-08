package Recursion;

public class StrictlyIncreasingLessThanN {
    public static void main(String[] args) {
        int num=10000;

        for(int i=1;i<=9;i++)
        solve(num,i);
    }

    private static void solve(int num, int ans) {
        if(ans>num){
            return;
        }

        if(ans<=num){
            System.out.print(ans+" ");
        }

        for (int i=0;i<=9;i++){
            if(ans%10<i)
            solve(num,ans*10+i);
        }
    }
}
