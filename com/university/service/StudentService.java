package com.university.service;

import java.util.ArrayList;
import com.university.model.Student;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayStudents() {
        for (Student s : students) {
            System.out.println(s.name + " | " + s.id + " | " + s.grade);
        }
    }
}
