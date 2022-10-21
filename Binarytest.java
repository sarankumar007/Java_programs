import java.util.*;
public class Binarytest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Long> sk=new HashMap<>();
        int [] a=new int[n];
        long [] b=new long[n];
        int[] c=new int[n];
sc.nextLine();
        for(int i=0;i<n;i++){
            String[] x=sc.nextLine().split(" ",2);
            a[i]=Integer.parseInt(x[0]);
            b[i]=Long.parseLong(x[1]);
        }

        for(int i=0;i<n;i++){
            if(a[i]>0){
                String xx=b[i]+"";
                xx=xx.substring(0,a[i]);
                int decimal=Integer.parseInt(xx,2);
                c[i]=decimal;

            }
            else if(a[i]==0){
                String xx=b[i]+"";
                int decimal=Integer.parseInt(xx,2);
                c[i]=decimal;
            }
            else
            {
                String xx=b[i]+"";
                a[i]=a[i]*-1;
                xx=xx.substring(xx.length()-a[i],xx.length());
                int decimal=Integer.parseInt(xx,2);
                c[i]=decimal;

            }
        }
        for(int i=0;i<n;i++){
            sk.put(c[i],b[i]);
        }
        Arrays.sort(c);
        for(int i=0;i<n;i++){
            System.out.print(sk.get(c[i])+" ");
        }
    }
}

//    Given N pairs consisting of an integer X representing the number of bits to consider and B representing a binary value as input, the program must find the decimal values based on the following conditions:
//        - If X is positive then consider the first X bits in the binary value.
//        - If X is negative then consider the last X bits in the binary value.
//        - If X is zero then consider all the bits in the binary value.
//
//        Finally, the program must sort (in ascending order) based on the considered binary values converted to their decimal equivalent.
//
//        Then the program must print the original binary values in the sorted order.
//        Boundary Condition(s)
//
//        1 <= N <= 100
//        -20 <= X <= 20
//        1 <= Number of bits in B <= 20
//        Input Format
//
//        The first line contains the value of N.
//        The next M lines contain pair of integers X and B separated by space(s).
//        Output Format
//
//        The first line contains N binary values separated by a space.
//        Example Input/Output 1
//
//        Input
//
//        4
//        2 10101101
//        -3 100010111
//        4 1111001010
//        -2 1010101011
//        Output
//
//        10101101 1010101011 100010111 1111001010
//        Explanation
//
//        The decimal value of the first 2 bits in 10101101 is 2.
//        The decimal value of the last 3 bits in 100010111 is 7.
//        The decimal value of the first 4 bits in 1111001010 is 15.
//        The decimal value of the last 2 bits in 1010101011 is 3.
//        Sort the binary values in the ascending order based on the decimal values and we get 2 3 7 15.
//        Hence the output is 10101101 1010101011 100010111 1111001010.
//
