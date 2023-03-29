
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// An immutable class Student
public final class Student 
{ 
    final String name; 
    final int regNo; 
    final List<String> courses;  // want to make Immutable 
    final Date finalDate;

    public Student(String name, int regNo, List<String> courses, Date finalDate) 
    { 
        this.name = name; 
        this.regNo = regNo; 
        this.courses = new ArrayList<>(courses);
        this.finalDate= finalDate;
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 

    public List<String> getCourses() {
        return Collections.unmodifiableList(courses);
    }

    public Date getFinalDate(){
        return new Date(this.finalDate.getTime()); 
    }
} 

class ImmutablityTest 
{ 
    public static void main(String args[]) 
    { 
        List<String> courses = new ArrayList<String>();
        Date date = new Date(2021-01-01);
        courses.add("java");
        courses.add("spring");
        courses.add("rest");

        Student s = new Student("ABC", 101, courses, date); 

        System.out.println("Before Update List");
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo()); 
        System.out.println(s.getCourses());
        System.out.println(s.getFinalDate());
        courses.add("Hibernate");

        date = new Date(2021-02-02);

        System.out.println("After Update List");
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo()); 
        System.out.println(s.getCourses());
        System.out.println(s.getFinalDate());

    } 
} 