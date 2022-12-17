package week11_11_19_2022.customClass.student;

import java.time.LocalDate;

public class Student {

    public String name;
    public  char gender;
    public LocalDate dateOfBirth;
    public int age,studentID;

    public Student(String name, char gender, LocalDate dateOfBirth, int age, int studentID) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
    /*
    Task 4 :

1. create a class named Student that has the followings features:
            Attributes:
                name, gender, dateOfBirth, age, studentID, grade

            Methods:
                sets all the attributes of the student object
                toString(): returns the full info of student Object

2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students
as parameter the return the list of students if the name start with "A"
     */






}
