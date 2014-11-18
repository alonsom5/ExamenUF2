public class Employee {
   //variables
   private String myName;
   private double mySalary;
   
   public Employee(String name, double salary) {
      myName = name;
      mySalary = salary;
   }

   public String getName() {
      return myName;
   }

   public double getSalary() {
      return mySalary;
   }

   public void raiseSalary(int percent) {
      mySalary = mySalary +
         percent * 0.01 * mySalary;
   }

   public void setSalary(double salary) {
      mySalary = salary;
   }
   //A la hora de Imprimirlo saldra el Name: getName() coge el nombre y el getSalary() coge el salrio.
   public String toString() {
      return "Name: " + getName() + ", Salary: " + getSalary();
   }
}
