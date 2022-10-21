
public class Exception {
    public static void main(String[] args) {

        try{
            int[] a=new int[5];
            int b=a[6]*(5/0);
        }

        catch (ArithmeticException e){
            System.out.println("divide by zero issue");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array bound issue");
        }
catch (java.lang.Exception e){
    System.out.println("parent exception");
}



    }
}
