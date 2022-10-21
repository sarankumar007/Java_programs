import java.util.*;
public class TwoSum {
    public static void main(String[] args) {

        int[] x={5,87,38,55,26};
        int t=43;
        int[] y=twosum(x,t);
        System.out.println(Arrays.toString(y));
    }

    public static int[] twosum(int[] num,int target){
        HashMap<Integer,Integer> a=new HashMap<>();
        if(num==null ||num.length<2 )
            return new int[]{-1,-1};
        for(int i=0;i<num.length;i++){
            a.put(num[i],i);
        }

        for(int i=0;i<num.length;i++){
            int complement=target-num[i];
            if(a.containsKey(complement)){
                return new int[] {i,a.get(complement)};
            }
        }
        return new int[] {-1,-1};
    }
}
