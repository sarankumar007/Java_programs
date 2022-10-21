public class patterns {
    public static void main(String[] args) {
        pattern5(5);


    }

    static void pattern1(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;   //n-(i-n)
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//*
//* *
//* * *
//* * * *
//* * *
//* *
//*
    }

    static void pattern2(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;   //n-(i-n)
            int space = n - col;
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//   *
//  * *
// * * *
//* * * *
// * * *
//  * *
//   *
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
//            1
//          2 1 2
//         3 2 1 2 3
//        4 3 2 1 2 3 4
//      5 4 3 2 1 2 3 4 5

    }

    static void pattern4(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;   //n-(i-n)
            int space = n - col;
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }
            for (int j = col; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= col; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

//                       1
//                     2 1 2
//                   3 2 1 2 3
//                 4 3 2 1 2 3 4
//               5 4 3 2 1 2 3 4 5
//                 4 3 2 1 2 3 4
//                   3 2 1 2 3
//                     2 1 2
//                       1


        static void pattern5(int n){
            int c=0,x=n*2-1;
            x=x/2;
            int t=1;
            for(int i=0;i<n;i++){
                int y=0;
                for(int j=0;j<n*2-1;j++){
                    if(j>=x && y<=c){
                        System.out.print(t*t+" ");
                        t++;
                        y++;
                    }
                    else
                        System.out.print("* ");
                }
                x--;
                c+=2;
                System.out.println();
            }
    }

    }

