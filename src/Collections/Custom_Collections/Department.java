package Collections.Custom_Collections;

public class Department {

    private int id;
    private String name ;
    private int age ;
    private String department_name;
    private String location;
    private String Address;


    public Department (int id, String name, int age, String department_name, String location, String Address){

        this.id =id;
        this.name =name;
        this.age =age;
        this.department_name = department_name;
        this.location = location;
        this.Address = Address;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDepartment_name(){
        return department_name;
    }
    public String getLocation(){
        return location;
    }
    public String getAddress(){
        return Address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department_name='" + department_name + '\'' +
                ", location='" + location + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
