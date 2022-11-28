package Access_Modifiers;

import Access_Modifiers.Private.Private_method;

public class Sample {
    public static void main(String[] args) {

        Private_method N = new Private_method();
       // N.myMethod (); we cant call private methods 

    }
}
