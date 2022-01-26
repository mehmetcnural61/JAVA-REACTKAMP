package Lecture2HomeWork;

public class CourseManager {
    //metot

    Course course1= new Course(5,"JAVA+REACT BOOTCAMP","Engin Demirog",56);

    public void EnrollToCourse(Course course){
        System.out.println(course.CourseName + " Kursuna Başarıyla Kayıt Yapıldı ! ");

    }
    public void showInfo(){
        System.out.println(course1.getCourseName()+" Kurs Adı Başarıyla Bilgilendirildi");
    }
}
