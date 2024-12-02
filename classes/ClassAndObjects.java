package classes;

class Employee{

    //instance variables
    String name, sex;
    int salary, age;

    protected Employee(String name, int age, String sex, int salary){
      this.name = name;
      this.age = age;
      this.sex = sex;
      this.salary = salary;
    }

    // we must override the toString method to get the print the attributes of the class
    //other-wise the output will be Classname@address
    @Override
    public String toString(){
        return "Employee name: " + name +  " ,Age: " + age +  " ,Sex: " + sex +  " ,Salary: " + salary;
    }
}

public class ClassAndObjects {
    public static void main (String[] args){
        Employee e1 = new Employee("Nik",27,"M", 40000);
        Employee e2 = new Employee("Ip",26,"F", 80000);

        System.out.println(e1);
        System.out.println(e2);


    }
}