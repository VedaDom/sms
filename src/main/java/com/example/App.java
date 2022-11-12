package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ServiceLoader;

import com.example.Models.Gender;
import com.example.Models.Level;
import com.example.Models.Student;

/**
 * Hello world!
 */
public final class App {

    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=anna;"
                + "user=sa;"
                + "password=VedaDom540367.;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";

        ServiceLoader.load(java.sql.Driver.class).iterator().next();

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
            System.out.println("Connected");
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }

        // Level levelOne = new Level(1, "Level one", new Student[] { new Student(1, 1,
        // "Anna", 17, Gender.Male) });

        // Student newStudent = new Student(2, 1, "Veda", 28, Gender.Male);

        // levelOne.addStudent(newStudent);

        // levelOne.remove(0);

        // newStudent.name = "Dominique";

        // levelOne.Edit(newStudent);

        // System.out.println(levelOne.getStudents()[0].name);
    }
}
