import java.util.*;
public class Anagrams
{
    public int anagramsPairs(int[] arr, int n)
    {
        String[] yo=new String[n];
        for(int i=0;i<n;i++){
            yo[i]=arr[i]+"";
        }
        if (n <= 0)
        {
            return 0;
        }
        String[] record = new String[n];
        String auxiliary = "";
        // Sort array string and put into record
        for (int i = 0; i < n; ++i)
        {
            char[] word = yo[i].toCharArray();
            // Sort word
            Arrays.sort(word);
            // Convert into String
            auxiliary = new String(word);
            record[i] = auxiliary;
        }
        String lol="";
        int max=-999999;
        int min=9999999;
        // Display relative pairs of anagrams
        for (int i = 0; i < n; ++i)
        {
            for (int j = i + 1; j < n; ++j)
            {
                if (record[i].equals(record[j]))
                {
                    int a=Integer.parseInt(yo[i]);
                    int b=Integer.parseInt(yo[j]);

                   if(a>max)
                       max=a;
                   if(a<min)
                       min=a;
                   if(b>max)
                       max=b;
                   if(b<min)
                       min=b;

                }
            }
        }
        return max-min;

    }
    public static void main(String[] args)
    {
        Anagrams task = new Anagrams();
        int[] arr = {
                122,112,221,444,555,666
        };
        // Get the length of array
        int n = arr.length;
        System.out.println(task.anagramsPairs(arr, n));
    }
}