package Java_Methods;

public class Constractors_1 {
    Constractors_1 (){

        int i =10;
        int j = 25;
        System.out.println(i+j);
    }

    Constractors_1 (int i, int j){

        System.out.println(i+j);
    }

    public static void main(String[] args) {

        Constractors_1 ravi = new Constractors_1 (10, 15); // Parameterized constructor
        Constractors_1 ram = new Constractors_1 (); // Constructor class name and mathod name same but we did not call method

    }

}



