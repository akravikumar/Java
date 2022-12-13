package Access_Modifiers.Private;

import Access_Modifiers.Private.Private_method;
import Access_Modifiers.Public.Public_modifier;

public class Sample {
    public static void main(String[] args) {

        Private_method N = new Private_method();
       // N.myMethod (); we cant call private methods

        Public_modifier R =new Public_modifier();
        R.myName(); // This is public method, it can access entire project


    }
}
