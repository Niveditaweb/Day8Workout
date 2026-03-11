public class pgm6 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch(NullPointerException e) {
            System.out.println("Null Pointer Exception occurred");
        }
    }
}