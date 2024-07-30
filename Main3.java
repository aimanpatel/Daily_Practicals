//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

package com_javapgm;

//Employee.java
public class Employee {
 private double salary;

 public Employee(double salary) {
     this.salary = salary;
 }

 public void work() {
     System.out.println("Employee is working.");
 }

 public double getSalary() {
     return salary;
 }
}

//HRManager.java
public class HRManager extends Employee {
 public HRManager(double salary) {
     super(salary);
 }

 @Override
 public void work() {
     System.out.println("HR Manager is managing HR tasks.");
 }

 public void addEmployee() {
     System.out.println("Employee added by HR Manager.");
 }
}

//Main.java
public class Main3 {
 public static void main(String[] args) {
     Employee emp1 = new Employee(50000);
     HRManager hrManager = new HRManager(70000);

     emp1.work();
     System.out.println("Employee Salary: " + emp1.getSalary());

     hrManager.work();
     System.out.println("HR Manager Salary: " + hrManager.getSalary());

     hrManager.addEmployee();
 }
}
