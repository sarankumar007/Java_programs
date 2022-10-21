////import java.util.Scanner;
////class Node{
////    int data;
////    Node next;
////}
////public class linkedlist{
////    static Node head;
////    static Node last;
////    static void insert(int num){
////        Node newnode=new Node();
////        newnode.data=num;
////        if(head==null){
////            head=newnode;
////            last=newnode;
////        }
////        else{
////            last.next=newnode;
////            last=newnode;
////
////        }
////    }
////    static void deletefront(){
////        head=head.next;
////    }
//////    static void deleteback(){
//////        head=head.next;
//////    }
////    static void display(){
////        Node temp=head;
////        while(temp!=null){
////
////            System.out.println(temp.data);
////            temp=temp.next;
////        }
////    }
////    public static void main(String[] args){
////        Scanner sc=new Scanner(System.in);
////        while(true){
////            int t=sc.nextInt();
////            if(t<0)
////                break;
////            insert(t);
////        }
////        deletefront();
////        display();
////    }}
//
//
//
//
//
//
//
//
//
//
//append without duplicate...........
//
//import java.util.Scanner;
//class Node{
//    int data;
//    Node next;
//}
//public class Main{
//    static Node head;
//    static Node last;
//    static void insert(int num){
//        Node newnode=new Node();
//        newnode.data=num;
//        Node temp=head;
//        if(head==null){
//            head=newnode;
//            last=newnode;
//        }
//        else{
//            int f=0;
//            while(temp!=null){
//                if(temp.data==num){
//                    f=1;
//                    break;
//                }
//                temp=temp.next;
//            }
//            if(f==0){
//                last.next=newnode;
//                last=newnode;
//            }
//
//        }
//    }
//
//    static void display(){
//        Node temp=head;
//        if(temp==null)
//            System.out.println("List is empty");
//        while(temp!=null){
//
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        while(true){
//            int t=sc.nextInt();
//            if(t<0)
//                break;
//            insert(t);
//        }
//        display();
//    }}
//
//
//
//
//
//
//
//
//
//
/*class Main
{
    static int top=-1;
    static int top1=-1;

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int[] a=new int[1000];
        int []b=new int[1000];
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            int t=sc.nextInt();
            push(t);
        }
        System.out.println("Stack 1 Elements:");
        display();
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            int t=sc.nextInt();
            push1(t);
        }
        System.out.println("Stack 2 Elements:");
        display1();
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        for(int i=0;i<d1;i++){
            delete();
        }
        System.out.println("Stack 1 Elements:");
        display();
        for(int i=0;i<d2;i++){
            delete1();
        }
        System.out.println("Stack 2 Elements:");
        display1();

        static void push(int t){
        top=top+1;
        a[top]=t;
    }
        static void pop(){
        if(top==-1)
            System.out.println("Underflow");
        else{
            top--;
        }
    }
        static void push1(int t){
        top1=top1+1;
        b[top]=t;
    }
        static void pop1(){
        if(top1==-1)
            System.out.println("Underflow");
        else{
            top1--;
        }
    }
        static void display(){
        for(int i=top;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
        static void display1(){
        for(int i=top1;i>=0;i--)
        {
            System.out.print(b[i]+" ");
        }
    }






    }
}
*/