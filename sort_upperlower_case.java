import java.util.*;
public class sort_upperlower_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] x=sc.nextLine().toCharArray();
        ArrayList<Character> a=new ArrayList<>();
        ArrayList<Character> b=new ArrayList<>();
        for(int i=0;i<x.length;i++){
            if(Character.isUpperCase(x[i])){
                a.add(x[i]);
            }
            else
                b.add(x[i]);

        }
        Collections.sort(a);
        int caps=a.size();
        Collections.sort(b,Collections.reverseOrder());
        for(int i=0;i<b.size();i++){
            a.add(b.get(i));
        }
        int i,j;
        int count=0;
        for(i=0,j=a.size()-1;i<a.size();i++,j--){
            if(i<caps)
            System.out.print(a.get(i));
            if(count<b.size()) {
                System.out.print(a.get(j));
                count++;
            }
        }

    }
}
