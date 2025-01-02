package variable_type.static_variable;

class Employee {
    static int salary;
}
public class Staticvariable {
    public static void main(String[] args) {
        // the class talks about static variable 
        Employee kanchan = new Employee();
        Employee kan = new Employee();
        kanchan.salary = 60000;
        kan.salary = 75000;
        Employee.salary = 550000;

        System.out.println("This is kanchan's salary" + kanchan.salary);
        System.out.println("This is kan's salary" + kan.salary);
        System.out.println("This is employee's salary" + Employee.salary);

        /* This will print 550000 for all the variables 
        * because the static method belongs to the class and not a particular instance
        * When you declare a variable as static, it is shared among all instances of the class.
        * Any change to a static variable affects the value for all instances because there is only one copy of the variable in memory.
        */

       // If you want that each instance should have different values then go for instance variable
       // rather than static variable
       
    }
}