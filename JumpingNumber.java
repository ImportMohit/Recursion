package Recursion;

public class JumpingNumber {
    public static void main(String[] args) {

        int num=100;
System.out.println(0);

     for(int i=1;i<=9;i++)
        solve(num,i);



    }
    private static void solve(int num, int ans) {

        if(ans<=num){
            System.out.print(ans+" ");

        }


        if(ans>num)
            return;




            int ansLast=ans%10;

            int next=ansLast+1;
            int prev=ansLast-1;

            if(ansLast!=9)
            solve(num, ans * 10 + next);

            if(ansLast!=0)
            solve(num, ans * 10 + prev);

    }
}
