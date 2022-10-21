import java.util.*;
public class charmultiply {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();


        String [] b=a.split("[a b c d e f g h i j k l m n o p q r s t u v w x y z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z]");
        int[] num=new int[b.length];
        for(int i=0;i<b.length;i++){
            num[i]=Integer.parseInt(b[i]);
        }
        int j=0;
        for(int i=0;i<a.length();i++){
            char x=a.charAt(i);

            if(Character.isAlphabetic(x)){
                int count=0;
                while(count<num[j]){
                    System.out.print(x);
                    count++;

                }
                j++;

            }
        }

    }
}