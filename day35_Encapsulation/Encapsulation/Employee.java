package day35_Encapsulation.Encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
       setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName (String name){
        if(this.name.isEmpty()){
            return;
        }
        this.name = this.name;
        }

    public void setAge(int age) {
        if(age<16 || age>90){
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            return;
        }
        this.salary = salary;
    }



    public  void setGender(char gender) {
        if (!(this.gender == 'F' || this.gender == 'M')) {
            return;

        }
        this.gender = this.gender;
    }

        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
    }
}
