import java.util.Scanner;
public class pgm1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two operands value");
        int a=s.nextInt();
        int b=s.nextInt();
        try{
            int res=a/b;
            System.out.println("The result is:"+a/b);
        }
        catch(ArithmeticException e){
            System.out.println("a is not divided by zero");
        }
        s.close();
    }
    
}
