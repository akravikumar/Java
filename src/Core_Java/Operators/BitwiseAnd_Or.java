package Core_Java.Operators;

public class BitwiseAnd_Or {
    public static void main(String[] args) {
        int i =10;
        int j =30;
        int l=50;

        //&& Logical end should satisfy Two statments true then it will excuts True

        if(i<j && i<l){

            System.out.println("True");
        }else {
            System.out.println("False");
        }

        // || OR Symbol should true atleast one then it will excutes True
        if(i==j || j>i){

            System.out.println("True");
        }else {
            System.out.println("False");

        }
    }
}
