package com_javapgm;

//Employee class
class Employee {
 private String name;
 private double salary;

 // Constructor
 public Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 // work method
 public void work() {
     System.out.println(name + " is working.");
 }

 // getSalary method
 public double getSalary() {
     return salary;
 }
}

//HRManager subclass inheriting from Employee
class HRManager extends Employee {
 // Constructor
 public HRManager(String name, double salary) {
     super(name, salary);
 }

 // Override work method
 @Override
 public void work() {
     System.out.println(getName() + " is managing HR tasks.");
 }

 // New method addEmployee
 public void addEmployee(Employee employee) {
     System.out.println("New employee " + employee.getName() + " added by " + getName());
 }
}

//Main class
public class Demo4 {
 public static void main(String[] args) {
     // Create an Employee
     Employee employee = new Employee("John", 50000);

     // Call work method of Employee
     employee.work();

     // Create an HRManager
     HRManager hrManager = new HRManager("Alice", 70000);

     // Call work method of HRManager
     hrManager.work();

     // Call addEmployee method of HRManager
     hrManager.addEmployee(new Employee("Bob", 55000));
 }
}
