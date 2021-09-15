import javax.swing.*;
import java.util.ArrayList;

public class Discord {

    private String kursName;

    private ArrayList<Teacher> teachers;
    private ArrayList<Mentor> mentors;
    private ArrayList<Student> students;

    public Discord(String kursName) {
        setKursName(kursName);
        teachers = new ArrayList<Teacher>();
        mentors = new ArrayList<Mentor>();
        students = new ArrayList<Student>();
    }

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void addStudent(Student student){
        students.add(student);
    }


}
