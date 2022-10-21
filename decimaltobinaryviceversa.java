//import java.util.*;
//public class decimaltobinaryviceversa {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        String x1=Integer.toBinaryString(a);
//        String x="";
//        String ans="";
//        for(int i=x1.length()-1;i>=0;i--){
//            x=x+x1.charAt(i);
//        }
//        char[] lol=x.toCharArray();
//        System.out.println(x);
//        for(int i=0;i<lol.length;i++){
//            if(i%2!=0)
//                lol[i]='1';
//        }
//        for(int i=lol.length-1;i>=0;i--){
//            ans=ans+lol[i];
//        }
//        int yo=Integer.parseInt(ans,2);
//        System.out.println(ans);
//        System.out.println(yo);
//    }
//
//}

//import java.util.*;
//public class decimaltobinaryviceversa{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        int [] a=new int[m];
//        int[] b=new int[n];
//        String xi="";
//        for(int i=0;i<m;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            b[i]=sc.nextInt();
//        }
//        for(int i=0;i<m;i++){
//            int f=0;
//            for(int j=0;j<n;j++){
//                if(a[i]==b[j])
//                {
//                    f=1;
//                    break;
//                }
//            }
//            if(f==0)
//                xi+=a[i]+" ";
//        }
//        for(int i=0;i<n;i++){
//            int f=0;
//            for(int j=0;j<m;j++){
//                if(b[i]==a[j])
//                {
//                    f=1;
//                    break;
//                }
//            }
//            if(f==0)
//                xi+=b[i]+" ";
//        }
//        String[] ans=xi.split("\\s");
//        if(ans[0].equals("")){
//            System.out.println("-1");
//            System.exit(0);
//        }
//        int t[]=new int[ans.length];
//        String x="";
//        for(int i=0;i<t.length;i++){
//
//            t[i]=Integer.parseInt(ans[i]);
//        }
//        Arrays.sort(t);
//        HashMap<Integer,Integer> mp = new HashMap<>();
//       for(int i=0;i<t.length;i++){
//           if(!mp.containsKey(t[i])){
//               System.out.print(t[i]+" ");
//               mp.put(t[i],1);
//           }
//
//       }
//    }
//}


//import java.util.*;
//public class decimaltobinaryviceversa
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        int m=256;
//        int n=str.length();
//        int dist=0;
//        boolean[] visited=new boolean[m];
//        Arrays.fill(visited,false);
//        for(int i=0;i<n;i++){
//            if(!visited[str.charAt(i)]){
//                visited[str.charAt(i)]=true;
//                dist++;
//            }
//        }
//        int start=0,i=-1;
//        int min=Integer.MAX_VALUE;
//        int count=0;
//        int[] curr=new int[m];
//        for(int j=0;j<n;j++){
//            curr[str.charAt(j)]++;
//            if(curr[str.charAt(j)]==1)
//                count++;
//            if(count==dist){
//                while(curr[str.charAt(start)]>1){
//                    if(curr[str.charAt(start)]>1)
//                        curr[str.charAt(start)]--;
//                    start++;
//                }
//                int miyamura=j-start+1;
//                if(min>miyamura){
//                    min=miyamura;
//                    i=start;
//                }
//            }
//        }
//        System.out.println(str.substring(i,i+min));
//
//
//    }
//}
//
//
//
//

import java.util.*;
public class decimaltobinaryviceversa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=5;
        int n2=10;
        //int n = n1-n2;

        for(int i=n2; i>=0 ;i--) {
            //System.out.println();
            for(int j=n1; j<=i ;j++) {
                System.out.print(j+" ");

            }
            if(i!=0)
            System.out.println();
        }
        //System.out.println("hekkko");

    }

}







































































