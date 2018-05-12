/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatestudentproject;

import daoimplementation.StudentDAOImplementation;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author Julian
 */
public class testStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAOImplementation dao = new StudentDAOImplementation();
        Student student = new Student();

        System.out.println("Enter the student first name");
        String firstName = sc.next();
        System.out.println("Enter the student last name");
        String lastName = sc.next();
        student.setFirstName(firstName);
        student.setLastName(lastName);

        dao.create(student);
        System.exit(0);
        System.out.println("Student " + firstName + " " + lastName + " has been created!");

    }

}
