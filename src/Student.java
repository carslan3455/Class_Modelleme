public class Student extends Person {

    private int homeWork;
    private int id;

    private static int counter = 1;

    public Student(String firstName, String lastName, String userName, String password, Roller roller, int homeWork) {
        super(firstName, lastName, userName, password, roller);
        setHomeWork(homeWork);
        setId();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = counter++;
    }

    public int getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(int homeWork) {
        this.homeWork = homeWork;
    }

    @Override
    public String toString() {
        return "Student{" +
                "homeWork=" + homeWork +
                '}';
    }
}
