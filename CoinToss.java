package Recursion;

public class CoinToss {

  static void solve(int n ,String ans){
      if(n==0)
      {
          System.out.println(ans);
          return;
      }

      solve(n-1,ans+'H');
      solve(n-1,ans+"T");



    }
static   int solve2(int n,String ans){

      if(n==0)
          return  1;

      int cnt=0;

   cnt+= solve2(n-1,ans+'H');
    cnt+=solve2(n-1,ans+"T");

      return cnt;

}
    static void noConsecutiveHead(int n ,String ans) {

        if(n==0)
        {
            System.out.println(ans);
            return;
        }


         if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
             noConsecutiveHead(n-1,ans+'H');

        noConsecutiveHead(n-1,ans+"T");





    }
    static void noConsecutiveHead(int n ,String ans,boolean shouldAddH) {

        if(n==0)
        {
            System.out.println(ans);
            return;
        }


       if(shouldAddH)
      noConsecutiveHead(n-1,ans+'H',false);

        noConsecutiveHead(n-1,ans+"T",true);





    }

    public static void main(String[] args) {
        int n=3;

        //solve(n,"");
        //System.out.println(solve2(n,""));
       // noConsecutiveHead(n,"");
        noConsecutiveHead(n,"",true);
    }
}
