//Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

package com_javapgm;

//Employee.java
class Employee2 {
 protected String name;
 protected String address;
 protected double salary;
 protected String jobTitle;

 public Employee2(String name, String address, double salary, String jobTitle) {
     this.name = name;
     this.address = address;
     this.salary = salary;
     this.jobTitle = jobTitle;
 }

 public double calculateBonus(double bonusPercentage) {
     return salary * bonusPercentage;
 }

 public void generatePerformanceReport() {
     // Logic to generate performance report
     System.out.println("Performance report generated for " + name);
 }

 public void manageProject(String projectName) {
     // Logic to manage project
     System.out.println(jobTitle + " " + name + " is managing project: " + projectName);
 }
}

//Manager.java
class Manager extends Employee2 {
 private int numberOfSubordinates;

 public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
     super(name, address, salary, jobTitle);
     this.numberOfSubordinates = numberOfSubordinates;
 }

 @Override
 public double calculateBonus(double bonusPercentage) {
     // Managers may have additional criteria for bonus calculation
     return super.calculateBonus(bonusPercentage) + numberOfSubordinates * 1000;
 }
}

//Developer.java
class Developer extends Employee2 {
 private String programmingLanguage;

 public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
     super(name, address, salary, jobTitle);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 public void generatePerformanceReport() {
     // Developers might have specific performance metrics
     System.out.println("Performance report generated for developer " + name);
 }
}

//Programmer.java
class Programmer extends Developer {
 private boolean knowsJava;

 public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, boolean knowsJava) {
     super(name, address, salary, jobTitle, programmingLanguage);
     this.knowsJava = knowsJava;
 }

 public void troubleshootCode() {
     // Logic to troubleshoot code
     System.out.println(name + " is troubleshooting code.");
 }
}

//Main.java
public class WXY {
 public static void main(String[] args) {
     Manager manager = new Manager("Seema Pathak", "123 Main St", 80000, "Manager", 5);
     Developer developer = new Developer("Geetanjali Naik", "456 Elm St", 60000, "Developer", "Java");
     Programmer programmer = new Programmer("Liza Rai", "789 Oak St", 70000, "Programmer", "Python", true);

     System.out.println("Manager's bonus: $" + manager.calculateBonus(0.1));
     developer.generatePerformanceReport();
     programmer.troubleshootCode();

     manager.manageProject("Project Android");
 }
}
