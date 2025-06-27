package com.university.main;

import com.university.model.Student;
import com.university.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student s1 = new Student("Eugene", "UEB3502023", 85.0);
        service.addStudent(s1);
        service.displayStudents();
    }
}
