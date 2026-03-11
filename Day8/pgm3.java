public class pgm3 {
    public static void main(String[] args) {
        String value="124";

        try {
            int va=Integer.parseInt(value);
            System.out.println(va);
        } 
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}