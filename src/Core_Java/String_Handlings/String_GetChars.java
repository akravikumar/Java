package Core_Java.String_Handlings;

public class String_GetChars {
    public static void main(String[] args) {

        String str = new String("hello world !!");

        char [] ch = new char[20];
        try {
            str.getChars(0,10,ch, 0);
            System.out.println(ch);

        }catch (Exception A){
            System.out.println(A);

        }finally {
            System.out.println("Thank you !");
        }

    }
}
