import java.util.*;
public class vpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int n=name.length();
//        StringBuilder hari=new StringBuilder(name);
//        String f= String.valueOf(hari.reverse());
//        f= hari.substring(1,n);

        String ff=name+name;


        char[] name1=new char[n*2-1];
        for(int i=0;i<n*2-1;i++){
            name1[i]=ff.charAt(i);
        }

        for(int i=0;i<name1.length;i++){
            for(int j=0;j< name1.length;j++){

                if(((i==j || i+j== (name1.length)-1)) && i<= name1.length/2)
                    System.out.print(name1[i]);


                else
                    System.out.print(" ");

            }
            System.out.println();
        }



    }



}
