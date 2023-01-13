package OOps_Concepts.Abstration.Interface;

public interface Test1 {


    static int ravi = 20;
    static int ravi2 = 30;


    public static void Test(String rajesh, String ramu){

      /*String rajesh = "hello ";
      String ramu = "How are you !"*/;
      String R = (rajesh+ramu);
      System.out.println(R);
    }


    public static void main(String[] args) {

    System.out.println(ravi+ravi2);
    Test1.Test("Hello ", "how are you ");  // We can't create object in interface but we can create static method in that

    }
}
