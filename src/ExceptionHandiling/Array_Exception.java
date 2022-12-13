package ExceptionHandiling;

public class Array_Exception {

    public static void main(String[] args) {

        int [] ravi = new int[5];
        ravi[0]=10;
        ravi[1]=15;
        ravi[2]=10;
        ravi[3]=50;
        ravi[4]=30;
       // ravi[5]=20;

      //  System.out.println(ravi[3]); // Printing specific value by using index number

        for(int i = 0; i<5; i++){
            System.out.println(ravi[i]); // happened exception due array values have given more then Size of the array

        }

        
    }
}
