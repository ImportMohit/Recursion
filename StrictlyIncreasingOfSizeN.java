package Recursion;

public class StrictlyIncreasingOfSizeN {
    public static void main(String[] args) {
        int n=3;


        solve(n,"");
    }

    private static void solve(int n, String i) {
        if(n==0){
            System.out.println(i);
            return;
        }

        for(int idx=0;idx<=9;idx++){
            if(i.length()==0 || i.charAt(i.length()-1)-'0'<idx)
                solve(n-1,i+idx);
        }

    }
}
