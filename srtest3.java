import java.util.*;
public class srtest3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==0){
                    if(row(a,i,r,c) && col(a,j,r,c)){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);

    }
    public static boolean row(int[][] a,int i,int r,int c){
        int count=0;
        for(int k=0;k<r;k++){
            for(int s=0;s<c;s++){
                if(k==i && a[k][s]==0){
                    count++;
                }
            }
        }
        return count == 1;
    }
    public static boolean col(int[][] a,int j,int r,int c){
        int count=0;
        for(int k=0;k<r;k++){
            for(int s=0;s<c;s++){
                if(s==j && a[k][s]==0){
                    count++;
                }
            }
        }
        return count == 1;
    }

}
//5 5
//1 1 1 1 1
//1 0 1 1 1
//1 1 1 0 1
//0 1 1 1 0
//1 0 0 1 1
