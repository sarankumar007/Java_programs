import java.util.*;
public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.replaceAll(" ", "");
        a = a.toLowerCase();
        char y = 'a';
        int count = 0;
        char[] b = a.toCharArray();
        for (int i = 0; i < b.length; i++) {

            for (char x : b) {
                if (x == y) {
                    count++;
                    y++;
                    break;


                }

            }

        }

        if (b.length < 26 || count!=26)
            System.out.println("not panagram");
        if(count==26)
            System.out.println("panagram");

    }
}
