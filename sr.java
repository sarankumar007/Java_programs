import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.*;
public class sr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        a=a.toLowerCase();
        String num="";
        String al="";
        int sum=0;
        for(int i=0;i<a.length();i++){
            char x=a.charAt(i);
            if(Character.isAlphabetic(x))
                al=al+""+x;
            else
                num+=x;
        }
        for(int i=0;i<num.length();i++){
            sum+=Integer.parseInt(num.charAt(i)+"");
        }
        for(int i=0;i<al.length();i++){
            int k=(int)al.charAt(i);
            if(k+sum<=122)
            {
                int saran=k+sum;
                char yo=(char)saran;
                System.out.print(yo);
            }
            else{
                int g=(k+sum)-122;
                int rolex=96+g;
                char ye=(char)rolex;
                System.out.print(ye);

            }
        }


    }
}