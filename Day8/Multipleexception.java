public class Multipleexception {
    public static void main(String[] args) {
        try{
            int[] num={1,2,3};
            int res=10/0;
            System.out.println(num[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
        catch(ArithmeticException e){
            System.out.println("cannot divided by zero");
        }
        catch(Exception e){
            System.out.println("Somthing went wrong");
        }
    }
    
}
