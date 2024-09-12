/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student_53;

/**
 *
 * @author pc
 */
class Student_53 {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private static String university;
    private static int studentCount = 0;
    public Student_53(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }
    public static void setUniversity(String university) {
        Student_53.university = university;
    }
    public void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }
    public static void displayTotalStudents() {
        System.out.println("Total Number of Students: " + studentCount);
    }
    public static void main(String[] args) {
         Student_53.setUniversity("University of Liberal Arts");
         
        Student_53 student1 = new Student_53(232014001, "Bushra", "Computer Science", 3.8);
        Student_53 student2 = new Student_53(232015002, "Shornaly", "Mechanical Engineering", 3.5);
        Student_53 student3 = new Student_53(232022003, "Tasnim", "Electrical Engineering", 3.9);
      
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();    
        Student_53.displayTotalStudents();
    }
}
