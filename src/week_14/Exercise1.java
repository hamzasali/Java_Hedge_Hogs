package week_14;

public class Exercise1 {


    public static void main(String[] args) {

        System.out.println("This is a A statement");

        try{
            throw new NullPointerException("null pointer");
        }catch (RuntimeException e){

            try{
                throw new RuntimeException("run time exception");
            }catch (RuntimeException ex){
                ex.printStackTrace();
            }


        }finally {
            System.out.println("finally");
        }

        System.out.println("This is a statement after exception handling");

    }
}
