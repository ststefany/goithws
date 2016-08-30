import java.util.Date;

public class Solution {

    //лень придумывать имена и сетить даты

    public static void main(String[] args) {
        Date date = new Date();
        String name = "name";
        Course[] coursesTaken = {new Course(date, " ")};
        Course course1 = new Course(date, name );
        Course course2 = new Course(date, name );
        Course course3 = new Course(date, name );
        Course course4 = new Course(date, name );
        Course course5 = new Course(date, name );
        Student student1 = new Student(name, name, 5);
        Student student2 = new Student(name, coursesTaken);
        Student student3 = new Student(name, name, coursesTaken, 5);
        CollegeStudent collegestudent1 = new CollegeStudent(name, name, 5);
        CollegeStudent collegestudent2 = new CollegeStudent(name, coursesTaken);
        CollegeStudent collegestudent3 = new CollegeStudent(name, name, coursesTaken, 5, name, 5, 6);
        SpecialStudent specialstudent1 = new SpecialStudent(name, name, coursesTaken, 5, name, 5, 6, 7);
        SpecialStudent specialstudent2 = new SpecialStudent(name, name, 5);
        SpecialStudent specialstudent3 = new SpecialStudent(name, coursesTaken);

    }
}
