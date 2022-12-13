package Client_Requirements;

public class Testing_Main {

    public static void main(String[] args) {

        Testing xyz = new Testing();
        xyz.myMethod();

         Testing_Main.hellRavi(20,30); //Static method

        Testing_Main Rk= new Testing_Main();  // Invoked construcktor method


        }


    public static void hellRavi(int a, int b){

        int rajesh = a+b;
        System.out.println(rajesh);

    }

        Testing_Main (){

        System.out.println("This is contructor method, when object is created it invokes  ");

        }

}
