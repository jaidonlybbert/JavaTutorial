import java.io.*;
public class EmployeeTest {

  public static void main(String args[]) {
    Employee empOne = new Employee("James Smith");
    Employee empTwo = new Employee("Jack Daniels");

    empOne.setAge(23);
    empOne.setDesignation("Developer");
    empOne.setSalary(12.21);
    empOne.printDetails();

    empTwo.setAge(63);
    empTwo.setDesignation("Programmer");
    empTwo.setSalary(12.91);
    empTwo.printDetails();
  }
}
