import java.util.*;
public class pattern_inverted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;

        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=x;
                x++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[j][i]=a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
