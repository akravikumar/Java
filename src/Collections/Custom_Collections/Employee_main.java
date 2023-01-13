package Collections.Custom_Collections;

import java.util.ArrayList;
import java.util.List;

public class Employee_main {

    public static void main(String[] args) {


        List<Employee>  refname = new ArrayList<>();

        Employee R1 = new Employee(101, "Ravi",24,1000000,"ravi@gmail.com", "Infosys");
        Employee R2 = new Employee(102,"Bheemesh", 23,1000000, "Bheem@gmail.com", "Deloite");


        refname.add(R1);
        refname.add(R2);

        refname.add(new Employee(103, "rajesh",30, 30000, "rajesh@gmail.com", "elderline"));
        refname.add(new Employee(104, "ramu", 50,40000, "ramu@gmail.com", "xyz"));
        refname.add(new Employee(105, "ranga", 40,50000, "ranga@gmail.com", "Abcd"));
        refname.add(new Employee(106, "gani", 25,60000, "gani@gmail.com", "RX100"));



      // refname.forEach(ramu->System.out.println(ramu.getId()));

       // refname.forEach(ravi->System.out.println(ravi)); to print this without if condition

        refname.forEach(Infy-> {
            if(Infy.getId()>103){
               // System.out.println(Infy);
                System.out.println(Infy.getId()+" "+ Infy.getName()+" " +Infy.getCompany());  // To call specific field

            }
        });






    }
}
