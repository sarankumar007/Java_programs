import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="";
        String t="";
        int f=0;
        int count=0;
        while(sc.hasNextLine()){
            count++;
            String lol=sc.nextLine();
            a=a+" "+lol;
            if(f==0) {
                t = a;
                f=1;
            }
            if(lol.equals("quit"))
                break;

        }
        a=a.trim();
        System.out.println(a);
//        String[] lmao=a.split("\\s");
//        count=count-1;
//        int z=0;
//        int[] yo=new int[lmao.length];
//        for(int i=0;i<lmao.length-1;i++){
//            if(!lmao[i].equals("quit"))
//            yo[i]=Integer.parseInt(lmao[i]);
//        }
//        String[] dummy=t.split("\\s");
//        int l=dummy.length;
//        int[][]x=new int[count][l];
//        for(int i=0;i<count;i++){
//            for(int j=0;j<l;j++){
//                x[i][j]=yo[z++];
//            }
//
//        }
//        for(int i=0;i<count;i++){
//            for(int j=0;j<l;j++)
//                System.out.print(x[i][j]);
//            System.out.println();
//        }
//

    }
}
