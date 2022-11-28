package ExceptionHandiling;

public class I_am_Handiling_Exception {

    public static void main(String[] args) {
        try{
            int i =5/0; // or. int i =5/0; it goes to exception so here handiling the Try catch blocks

            System.out.println(i);// Abnormal code

        }catch (Exception X){

            System.out.println(X);// Here we are handiliing the abnormal code Exception. Ex: for understanding the particular exception
            System.out.println(); // Line down executing
            System.out.println(" You endterd invalid number"); // Catch block for user understanding exception
        }
        finally {
            System.out.println();

            System.out.println("Thank you.., BYE"); // finally block it can excute either exception occur or not

        }
    }
}
