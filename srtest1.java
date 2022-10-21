import java.util.*;
public class srtest1 {
    public static void main(String[] args) {
        //r*c max value
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int t=0,k=0,q=0,s=0;
        int[] row1=new int[c-2];
        int[] row2=new int[c-2];
        int[] col1=new int[r-2];
        int[] col2=new int[r-2];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 && j!=0 && j!=c-1 ){
                    row1[t++]=a[i][j];
                }
                if(i==r-1 && j!=0 && j!=c-1){
                    row2[k++]=a[i][j];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j==0 && i!=0 && i!=r-1){
                    col1[q++]=a[i][j];
                }
                if(j==c-1 && i!=0 && i!=r-1){
                    col2[s++]=a[i][j];
                }
            }
        }
        Arrays.sort(row1);
        Arrays.sort(row2);
        Arrays.sort(col1);
        Arrays.sort(col2);
        int m1=row1[row1.length-1];
        int m2=row2[row2.length-1];
        int m3=col1[col1.length-1];
        int m4=col2[col2.length-1];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 && j!=0 && j!=c-1){
                    a[i][j]=m1;
                }
                if(i==r-1 && j!=0 && j!=c-1){
                    a[i][j]=m2;
                }
                if(j==0 && i!=0 && i!=r-1){
                    a[i][j]=m3;
                }
                if(j==c-1 && i!=0 && i!=r-1){
                    a[i][j]=m4;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
