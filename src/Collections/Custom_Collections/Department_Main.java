package Collections.Custom_Collections;

import javax.swing.text.InternationalFormatter;
import java.util.*;

public class Department_Main {
    public static void main(String[] args) {

        Set<Department> data = new LinkedHashSet<>();

        Department request = new Department(101,"Ravi", 24,"WDSC", "Hyderabad","H No : 104 - Madhuranagar");
        data.add(request);

        data.add(new Department(102, "Rajesh", 28,"xyz", "Miyapur","Vizag"));
        data.add(new Department(102, "Rajesh", 28,"xyz", "Miyapur","Hyderabad"));

        data.add(new Department(103, "Rajesh", 29,"bike", "Pangagutta","USA"));
        data.add(new Department(104, "Rajesh", 30,"car", "secundarbad","Ameerpet"));
        data.add(new Department(105, "Rajesh", 31,"Hotel", "Miyapur","Ameerpet"));
        data.add(new Department(107, "Rajesh", 32,"Nurox", "Miyapur","Ameerpet"));
        data.add(new Department(107, "Rajesh", 33,"amazon", "Miyapur","Ameerpet"));
        data.add(new Department(108, "Rajesh", 34,"flifcart", "Miyapur","Ameerpet"));
        data.add(new Department(109, "Rajesh", 35,"newyark", "Miyapur","Ameerpet"));
        data.add(new Department(110, "Rajesh", 36,"florida", "Miyapur","Ameerpet"));

//  data.forEach(info-> System.out.println(info.toString()));

//       data.forEach(Information -> {
//            if(Information.getAddress()==("Ameerpet") || Information.getAddress()==("USA")){
//                System.out.println(Information);
//            }
//        });


        data.forEach(Dept ->{
            if(Dept.getAddress() ==("Ameerpet") || Dept.getAge()>30){
                System.out.println(Dept);
            }
        });





    }
}
