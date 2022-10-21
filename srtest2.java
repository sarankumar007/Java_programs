import java.util.*;
public class srtest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            a.add(t);
        }
        int k = sc.nextInt();
        int f = 0;
        for (int i = 0; i < k; i++) {
            int x = a.get(n / 2 - 1);
            int y = a.get(n / 2);
            int z = a.get(n / 2 + 1);
            if (x < y && x < z) {
                f = x;
                a.remove(n / 2 - 1);
                a.add(0, f);
            } else if (z < y && z < x) {
                f = z;
                a.remove(n / 2 + 1);
                a.add(f);
            } else {
                if (a.get(0) < a.get(a.size() - 1)) {
                    f = a.get(n / 2);
                    a.remove(n / 2);
                    a.add(0, f);
                } else {
                    f = a.get(n / 2);
                    a.remove(n / 2);
                    a.add(f);
                }
            }


        }
        for (int lo = 0; lo < a.size(); lo++) {
            System.out.print(a.get(lo) + " ");

        }
    }
}
