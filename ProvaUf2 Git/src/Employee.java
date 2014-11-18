public class Employee {

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

   public void raiseSalary(double percent) {
      mySalary = mySalary +
         percent * 0.01 * mySalary;
   }

   public void setSalary(int salary) {
      mySalary = salary;
   }

   public String toString() {
      return "Name: " + getName() +
             ", Salary: " + getSalary();
   }
}
