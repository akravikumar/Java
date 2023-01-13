package OOps_Concepts.Abstration;

public interface A {

    // We can achieve 100% abstraction with interface baz we have only abstract methods in interfaces

    void a();
    void b();
    void c();
    void d();
}
 abstract class B implements A{


    public void C (){

        System.out.println("Im a C");
    }

}
 class M extends B{
    public void a (){

        System.out.println("I am A");
    }

     @Override
     public void b() {
         System.out.println("I am B");

     }

     @Override
     public void c() {
         System.out.println("I am C");

     }

     @Override
     public void d() {
         System.out.println("I am D");

     }
 }

 class Test5{

     public static void main(String[] args) {

         A a =new M();
         a.a();
         a.b();
         a.c();
         a.d();
     }
 }
