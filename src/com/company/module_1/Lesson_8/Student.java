package com.company.module_1.Lesson_8;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
    }

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData() {
        return id + ", " + name + ", " + surname + ", " + gpa;
    }
//
    public void topStudent(Student [] students) {
//         = new Student[100];

        for (int i = 0; i < students.length;) {
            Student topStudent = students[i];
            students[i].getStudentData();
            int maxgpa = 0;
            for (i = 0; i < students.length; i++) {
                students[i].gpa = maxgpa;
                if (students[i].gpa > maxgpa) {
                    students[i] = topStudent;
                    System.out.println(topStudent +"if");
                }
                System.out.println(topStudent);
            }
            System.out.println("topStudent = " + topStudent);
//            System.out.println(students[i].topStudent());
        }

    }

}






