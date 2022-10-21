import java.util.*;
public class mileage {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] car=new String[10000];
        double[] mile=new double[10000];



        String[] x=sc.nextLine().split("\\s");
        for(int i=0;i<x.length;i++){

           String[] y=x[i].split("@");

            car[i]=y[0];
            mile[i]=Double.parseDouble(y[1]);
        }


        double min=mile[0];
        int f=0;
        for(int j=0;j<x.length;j++){
            if(mile[j]<min){
                min=mile[j];
                f=j;
            }
        }
        System.out.println(car[f]);

    }
}