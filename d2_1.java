import java.util.*;
public class d2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="saran";
        String password="hello";
        System.out.println("enter username");
        String username=sc.next();
        System.out.println("enter pass");
        String pass=sc.next();
        if(name.equals(username) && pass.equals(password))
            System.out.println("transaction success");
        else
            System.out.println("transaction failed");

    }
}
