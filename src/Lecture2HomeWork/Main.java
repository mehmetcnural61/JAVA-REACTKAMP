package Lecture2HomeWork;

public class Main {
    public static void main(String[] args) {

Course course1 = new Course(1,"Java+React CAMP","Engin Demirog",56);
Course course2 = new Course(2,"Python CAMP","Engin Demirog",38);
Course course3 = new Course(3,"JavaScript CAMP","Engin Demirog",25);

        Course[] courses = {course1,course2,course3};

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");
        //veri tür-takma isim
        for (Course course:courses){
            System.out.println(course.CourseName+" Kurs Eğitmeni ="+course.Instructor);
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");

        for (int i=0;i<courses.length;i++){
            System.out.println(courses[i].CourseName+" Kurs Süresi "+courses[i].timeHour+" Saat");
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");

        //veritipi     örnekisim      cons çalıştırmak için vtipi
        CourseManager courseManager = new CourseManager();
        courseManager.EnrollToCourse(course1);
        courseManager.EnrollToCourse(course2);
        courseManager.EnrollToCourse(course3);
        courseManager.showInfo();
    }
}
