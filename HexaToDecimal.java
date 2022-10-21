import java.util.*;
public class HexaToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=0;
        int temp=0;
        int xa=0;

        String n=sc.nextLine();
        //1AF
        //l=3
        for(int i=n.length()-1;i>=0;i--) {
           char b=n.charAt(i);

           if(Character.isAlphabetic(b)){
               switch (b){
                   case 'A':{
                       xa=10;
                       break;
                   }
                   case 'B':{
                       xa=11;
                       break;
                   }
                   case 'C':{
                       xa=12;
                       break;
                   }
                   case 'D':{
                       xa=13;
                       break;
                   }
                   case 'E':{
                       xa=14;
                       break;
                   }
                   case 'F':{
                       xa=15;
                       break;
                   }

               }

           }
           else {
               xa = Integer.parseInt(b+"");
           }
           temp += xa * Math.pow(16, j);
                j++;
            }
        System.out.println(temp);
        }

    }

