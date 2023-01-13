package OOps_Concepts.Inheritance;


class SingleEx{

    public void myMethod() {
        System.out.println("I am from parent class ");
    }

}


public class Single_Level extends SingleEx{

    public static void main(String[] args) {
        Single_Level RX = new Single_Level();
        RX.myMethod();
    }

}
