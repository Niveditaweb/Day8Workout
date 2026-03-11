class Arrayexception{
    public static void main(String[]arg){
        try{
            throw new ArithmeticException("Access Denied");
        }
        catch(Exception e){
            System.out.println("somthing went wrong");
        }
        finally{
            System.out.println("finally block executed!");
        }
    }
}