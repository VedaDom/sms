package com.example.Models;

public class Student extends Person {
    public int id;
    public int level;

    public Student(int id, int level, String name, int age, Gender gender) {
        this.id = id;
        this.level = level;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
