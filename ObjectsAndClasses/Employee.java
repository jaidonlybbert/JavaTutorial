// Jaidon Lybbert
// June 27, 2019
// Tutorial from tutorialspoint.com

import java.io.*;
public class Employee {

  String name;
  int age;
  String designation;
  double salary;

  public Employee(String name) {
    this.name = name;
  }

  public void setAge(int empAge) {
    age = empAge;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Designation: " + designation);
    System.out.println("Salary: " + salary);
  }
}
