/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatestudentproject;

import daoimplementation.StudentDAOImplementation;
import model.Student;
import util.HibernateUtil;

/**
 *
 * @author Julian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentDAOImplementation dao = new StudentDAOImplementation();
        Student student = new Student();
        student.setFirstName("TEST");
        student.setLastName("Test");
       
        dao.create(student);
        System.exit(0);
    }
    
}
