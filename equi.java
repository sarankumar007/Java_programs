import java.util.Scanner;

public class equi {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int left;
        int right;
        int f1=0;
        int result=0;
        int sum=0;
        int index=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            right=0;
            left=0;
            for(int j=0;j<i;j++) {
                left = left + arr[j];
                //System.out.println(left);
            }
            for (int k = i+1; k < n; k++) {

                right =right+arr[k];
                //System.out.println(right);
            }
            if(left==right)
            {
                f1 = 1;
                if(result<arr[i]) {
                    result=arr[i];
                    index=i;
                    sum=right;
                }

            }
        }
        if(f1==0)
        {
            System.out.println("No index");
        }
        if(f1==1)
        {
            System.out.println("equi element "+ result);
            System.out.println("equi index " +index);
            System.out.println("equi sum "+sum);
        }
    }
}
