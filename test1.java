import java.util.*;
public class test1 {

    public static void main(String[] args) {
        test1 l = new test1();
        int lol=l.totalHillWeight(4,1,5);
        System.out.println(lol);

    }
    public int totalHillWeight(int input1, int input2, int input3){
        int sum=0;
        int prev=0;
        for(int i=0;i<input1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                sum+=input2;
            }
            for(int k=0;k<i;k++){
                sum+=prev;
            }
            prev=input2;
            input2+=input3;
        }
        return sum;
    }
    }