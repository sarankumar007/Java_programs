import java.util.*;
public class test {
    public String JumbleWords(String a,int n) {

        String []x=a.split("\\s");
        String ans="";
        for(int i=0;i<x.length;i++){
            String t=x[i];
            String lol="";
            String y="";
            for(int k=0;k<t.length();k++){
                if(k%2==0)
                y=y+t.charAt(k);
                else {

                    lol = lol + t.charAt(k);
                }
            }
            if(n==1)
            {
                char[] lmao=lol.toCharArray();
                String lmao1="";
                for(int j=lmao.length-1;j>=0;j--) {
                    lmao1 = lmao1 + "" + lmao[j];
                    lol=lmao1;
                }
            }
            ans=ans+y+lol+" ";
        }
return ans;

    }

    public static void main(String[] args) {
        test o=new test();
        String l=o.JumbleWords("wipro limited",2);
        System.out.println(l);
    }
}
