public class pgm4 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Program executed");
        }
    }
}