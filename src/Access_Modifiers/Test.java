package Access_Modifiers;

import Access_Modifiers.Private.Private_method;
import Access_Modifiers.Public.Public_modifier;
import Access_Modifiers.Public.subPub.Defulalt_1;
import Access_Modifiers.Public.subPub.Protected_1;
import Access_Modifiers.Public.subPub.SampleSub;

public class Test {
    public static void main(String[] args) {

        Private_method N = new Private_method();
        // N.myMethod (); we cant call private methods

        Public_modifier R =new Public_modifier();
        R.myName(); // This is public method, it can access entire project

        SampleSub D = new SampleSub();
        D.myNew(100000, "Ravi"); //  This is public method, it can access entire project

        Defulalt_1 L = new Defulalt_1();
       // L.myPrinter(); It is defualt method it cant access outside the pakage

        Protected_1 Z = new Protected_1();
           // Z.myLap(); Protected it can access with the pakages and with the sub pakages
    }
}
