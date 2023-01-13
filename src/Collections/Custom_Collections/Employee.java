package Collections.Custom_Collections;

public class Employee extends Object{


        private  int id ;
        private String name ;
        private int age;
        private int salary;
        private String email;
        private String company;


        public Employee (int id, String name,int age, int salary, String email, String company){

                this.id =id;
                this.name =name;
                this.age =age;
                this.salary =salary;
                this.email = email;
                this.company =company;
        }


        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public int getAge(){
                return age;
        }

        public int getSalary() {
                return salary;
        }

        public String getEmail() {
                return email;
        }

        public String getCompany() {
                return company;
        }

        @Override
        public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", salary=" + salary +
                        ", email='" + email + '\'' +
                        ", company='" + company + '\'' +
                        '}';
        }
}
