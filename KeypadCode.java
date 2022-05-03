package Recursion;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class KeypadCode{


    static String getCode(char c){
        if(c=='1')
            return "abc";
        if(c=='2')
            return "def";
        if(c=='3')
            return "ghi";
        if(c=='4')
            return "jkl";
    	if(c=='5')
            return "mno";
		if(c=='6')
            return "pqrs";
		if(c=='7')
            return "tuv";
		if(c=='8')
            return "wx";
		if(c=='9')
            return "yz";
		return "";

}
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str="123";

       int cnt= solve(str,"");
      // System.out.println(cnt);
System.out.println();

       solve("123");



    }

    private static int solve(String ques, String ans) {

        if(ques.length()==0){
           // System.out.print(ans+" ");

            return 1;
        }

        //123


        int count=0;

        String code=getCode(ques.charAt(0));//abc

        for(int i=0;i<code.length();i++)
              count+=  solve(ques.substring(1),ans+code.charAt(i));//23     // a   b    c



         return count;

    }


    static void solve(String ques)
    {



        ArrayList<String> a=new ArrayList<>();
        ArrayList<String> b=new ArrayList<>();


        String code=getCode(ques.charAt(0));

        for(int i=0;i<code.length();i++)
             a.add(code.charAt(i)+"");


        for(int i=1;i<code.length();i++){

            code=getCode(ques.charAt(i));

            for(String st : a){

                for(int j=0;j<code.length();j++)
                     b.add(st+code.charAt(j));


            }
            a=b;
            b=new ArrayList<>();


        }






       System.out.println(a);
       System.out.print(a.size());


    }



}
























