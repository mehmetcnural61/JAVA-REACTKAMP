package Lecture2HomeWork;

import Lecture2.Product;

public class Course {

    int id;
    String CourseName;
    String Instructor;
    double timeHour;
    //Constructor (Yapıcı)
 public Course(){
    System.out.println("Courses");
}
    public Course(int id,String CourseName,String Instructor,double timeHour){
        this();
        this.id=id;
        this.CourseName=CourseName;
        this.Instructor=Instructor;
        this.timeHour=timeHour;

    }

    public String getCourseName() {
        return CourseName;
    }
}
