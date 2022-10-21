import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class dummy1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        String x=Long.toBinaryString(a);
        int max=Integer.MIN_VALUE;
        int count=0;
        int f=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1') {
                count++;
                if(i==x.length()-1 && f==0){
                    max=count;
                }
            }
            else{
                f=1;
                if(count>max) {
                    max = count;
                    count = 0;
                }
            }

        }
        System.out.println(max);
    }
}
