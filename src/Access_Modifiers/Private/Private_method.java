package Access_Modifiers;

public class Private_method {

// If we create any method in private it can the class
     protected void myMethod (){
        int i = 100;
        int j = 200;
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        Private_method R = new Private_method();
                R.myMethod();
    }
}
