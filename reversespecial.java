import java.util.*;
public class reversespecial{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();

        System.out.println(reverseStrSpecial(str));

        }

public static String reverseStrSpecial(String str) {
        int len = str.length();
        char[] revStrArr = new char[len];
        int j = len-1;
        for (int i=0; i <= j; ) {
        if(!Character.isAlphabetic(str.charAt(i))) {
        revStrArr[i] = str.charAt(i);
        i++;
        } else if (!Character.isAlphabetic(str.charAt(j))) {
        revStrArr[j] = str.charAt(j);
        j--;
        } else {
        revStrArr[j]=str.charAt(i);
        revStrArr[i]=str.charAt(j);
        j--;
        i++;
        }
        }

        return new String(revStrArr);
        }
        }