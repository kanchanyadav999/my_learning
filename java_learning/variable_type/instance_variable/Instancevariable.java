package variable_type.instance_variable;

// import java.awt.image.SampleModel;

public class Instancevariable {
        // this class talks about the instance variable
        // A variable declared inside the class but outside the method is called as instance variable
        // the variable starts with public and you have to create a constructor class and in the main method you have to create object for that.
        public String name;
        public int number = 10;

        private double salary;

        // create a constructor to intiate the instance variable
        public Instancevariable(){
            this.name = "Kanchan" ;

        }
        public void Setsalary(Double usersal) {
            salary = usersal;
        }
        public double getsalary() {
            return salary;
        }

        // create a main method to create object of this class
        public static void main(String[] args) {
            Instancevariable obj = new Instancevariable();
            System.out.println("this prints instance variable name: " + obj.name);
            System.out.println("This prints instance variable number : " + obj.number);
            obj.Setsalary(640000.00);
            System.out.println("this is printing a private salary variable: " + obj.getsalary());
        }
}