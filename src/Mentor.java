public class Mentor extends Person{

    private int day;
    private int id;

    private static int counter = 1;

    public Mentor(String firstName, String lastName, String userName, String password, Roller roller, int day) throws Exception {
        super(firstName, lastName, userName, password, roller);
        setDay(day);
        setId();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = counter++;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "id='" + id + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", userName='" + getUserName() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", roller=" + getRoller().getRollerNummer() +
                ", day=" + day +
                '}';
    }
}
