/*You need to create following structure of the classes.

Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName.
Create two constructors with fields startDate, name; and hourseDuration, name, teacherName.



Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
Create three constructors: two the same as in CollegeStudend and one with secretKey field.

Create getters and setters for all fields and make fields private as OOP principle follows. Create 5 objects Course class.
Create objects of others classes using every constructor. You must have 13 objects in Solution class.
*/

import java.util.Date;

public class Course {

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;


    public Course (Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course (int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
