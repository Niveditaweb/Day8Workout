public class pgm5 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        }
    }
}