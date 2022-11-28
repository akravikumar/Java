package Access_Modifiers.Public;

public class Public_modifier {

    public void myName(){
        String ravi = "ram";
        String rajesh = "Gani";
        System.out.println(ravi+rajesh);
    }

    public static void main(String[] args) {
        Public_modifier m = new Public_modifier();
                m.myName();
    }
}
