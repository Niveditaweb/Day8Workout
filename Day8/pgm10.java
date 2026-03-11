public class pgm10 {
    public static void main(String[] args) {
        try {
            try {
                int a = 10;
                int b = 0;
                int result = a / b;
                System.out.println(result);
            } catch(ArithmeticException e) {
                System.out.println("Arithmetic Exception occurred");
            }

            int[] arr = {1,2,3};
            System.out.println(arr[5]);

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred");
        }
    }
}