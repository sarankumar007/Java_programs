import java.util.*;
class Node {
    int data;
    Node left=null,right=null;

}
public class tree {
    static int f=0,k=0;
    static String x="";
    static void insert(int num){
        Node newNode=new Node();
        newNode.data=num;
        if(root==null){
            root=newNode;
        }
        else{
            push(root,newNode);
        }
    }

    static void push(Node temp, Node newNode){
        if(newNode.data>temp.data){
            if(temp.right==null){
                temp.right=newNode;
            }
            else{
                push(temp.right,newNode);
            }
        }
        else{
            if(temp.left==null){
                temp.left=newNode;
            }
            else{
                push(temp.left,newNode);
            }
        }
    }

    static void display(){
//        Node3 temp=root;
        preorder(root);
    }
    static void preorder(Node temp){
        if(temp==null){
            return;
        }
         if(temp.data==k || f==1) {
             x += temp.data + " ";
             f=1;
         }
        preorder(temp.left);
        preorder(temp.right);


    }
//    static Node left;
//    static Node right;
    static Node root;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            insert(in.nextInt());
        }
         k=in.nextInt();
        display();
        if(x.length()>0)
        System.out.println(x.trim());
        else
            System.out.println("-1");
    }
}
//50 37 18 45 97 93 34 17 57 33 85 99 26 41 92 16 11 52 72 64 25 69 98 66 76 56 84 60 20 86 35 59 48 96 40 79 38 32 55 31 54 67 28 75 36 70 68 95 74 78 89 26
