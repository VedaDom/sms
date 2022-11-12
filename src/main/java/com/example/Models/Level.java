package com.example.Models;

public class Level {
    public int id;
    public String name;
    private Student[] students;

    public Level(int id, String name, Student[] students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public int remove(int index) {

        if (index > students.length - 1) {
            return -1;
        }

        Student[] temp = new Student[students.length - 1];

        for (int i = 0, newIndex = 0; i < students.length; i++) {
            if (i != index) {
                temp[newIndex] = students[i];
                newIndex++;
            }
        }

        students = temp;

        return index;
    }

    /*
     * This adds a student
     */
    public int addStudent(Student student) {
        Student[] temp = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }
        temp[temp.length - 1] = student;
        students = temp;
        return students.length;
    }

    public Student Edit(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].id == student.id) {
                students[i] = student;
            }
        }
        return student;
    }
}
