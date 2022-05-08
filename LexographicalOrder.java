package Recursion;

public class LexographicalOrder {
    public static void main(String[] args) {
        int num=20;


            solve(num,0);
    }

    private static void solve(int num, int ans) {

        if(ans<=num){
            System.out.print(ans+" ");

        }


        if(ans>num)
            return;


        for(int i=0;i<=9;i++) {
            if(i==0 && ans==0)
                continue;
            solve(num, ans * 10 + i);
        }
    }
}
