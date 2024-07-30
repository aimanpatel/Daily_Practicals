//Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.

package com.Abstraction;

import java.util.ArrayList;

//Student.java
public class Student {
 // Private instance variables
 private int student_id;
 private String student_name;
 private ArrayList<Integer> grades;

 // Constructor
 public Student(int student_id, String student_name) {
     this.student_id = student_id;
     this.student_name = student_name;
     this.grades = new ArrayList<>();
 }

 // Getter method for student_id
 public int getStudentId() {
     return student_id;
 }

 // Setter method for student_id
 public void setStudentId(int student_id) {
     this.student_id = student_id;
 }

 // Getter method for student_name
 public String getStudentName() {
     return student_name;
 }

 // Setter method for student_name
 public void setStudentName(String student_name) {
     this.student_name = student_name;
 }

 // Method to add a grade to the grades list
 public void addGrade(int grade) {
     if (grade >= 0 && grade <= 100) {
         grades.add(grade);
         System.out.println("Grade added successfully.");
     } else {
         System.out.println("Invalid grade! Grade must be between 0 and 100.");
     }
 }

 // Main method to test the Student class
 public static void main(String[] args) {
     // Create a new Student object
     Student student = new Student(1001, "Arya Sinha");

     // Print the initial details of the student
     System.out.println("Initial Details:");
     System.out.println("Student ID: " + student.getStudentId());
     System.out.println("Student Name: " + student.getStudentName());

     // Modify the student details using setter methods
     student.setStudentId(1002);
     student.setStudentName("Rahul Kapoor");

     // Print the modified details of the student
     System.out.println("\nModified Details:");
     System.out.println("Student ID: " + student.getStudentId());
     System.out.println("Student Name: " + student.getStudentName());

     // Add grades to the student object
     student.addGrade(85);
     student.addGrade(92);
     student.addGrade(78);
     student.addGrade(105); // This grade is invalid

     // Print all grades added
     System.out.println("\nGrades:");
     System.out.println(student.grades);
 }
}
