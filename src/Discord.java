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

    public void addTeacher(Teacher teacher) throws Exception {
        try {
            if (teacher.getPassword().length() >= 6) {
                teachers.add(teacher);
            }

        } catch (Exception ex) {
            System.out.println(teacher.getUserName()+ " : Could not be added");
            throw new Exception("The password entered is too short");

        }
    }

    public void addMentor(Mentor mentor) throws Exception {
        try {
            if (mentor.getPassword().length() >= 6) {
                mentors.add(mentor);
            }

        } catch (Exception ex) {
            System.out.println(mentor.getUserName()+ " : Could not be added");
            throw new Exception("The password entered is too short");

        }
    }

    public void addStudent(Student student) throws Exception {
        try {
            if (student.getPassword().length() >= 6) {
                students.add(student);
            }

        } catch (Exception ex) {
            System.out.println(student.getUserName()+ " : Could not be added");
            throw new Exception("The password entered is too short");

        }
    }

    public void deleteTeacher(Teacher teacher){
        for (Teacher t:teachers ) {
            if (t==teacher){
                System.out.println(t.getUserName()+ " : Deleted");
                teachers.remove(teacher);
                break;
            }else {
                System.out.println("Not found a Teacher");
            }
        }

    }

    public void deleteMentor(Mentor mentor) {
        for (Mentor m : mentors) {
            if (m == mentor) {
                System.out.println(m.getUserName() + " : Deleted");
                mentors.remove(mentor);
                break;
            } else {
                System.out.println("Not found a Mentor");
            }
        }
    }
    public void deleteStudent(Student student) {
        for (Student s : students) {
            if (s == student) {
                System.out.println(s.getUserName() + " : Deleted");
                students.remove(student);
                break;
            } else {
                System.out.println("Not found a Student");
            }
        }
    }

    public void getTeacher(){
        for (Teacher t:teachers) {
            System.out.println("Teacher : " + t);
        }
        System.out.println("Total number of Teacher : " + teachers.size());
    }

    public void getMentor(){
        for (Mentor m:mentors) {
            System.out.println("Mentor : " + m);
        }
        System.out.println("Total number of Mentor : " + mentors.size());
    }

    public void getStudent(){
        for (Student s: students) {
            System.out.println("Student : " + s);
        }
        System.out.println("Total number of Student : " + students.size());
    }

    @Override
    public String toString() {
        return "Discord{" +
                "kursName='" + kursName + '\'' +
                ", teachers=" + teachers +
                ", mentors=" + mentors +
                ", students=" + students +
                '}';
    }
}
