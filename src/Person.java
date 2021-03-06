public class Person {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Roller roller;

    public Person(String firstName, String lastName, String userName, String password, Roller roller) throws Exception {
        setFirstName(firstName);
        setLastName(lastName);
        setUserName(userName);
        setPassword(password);
        setRoller(roller);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        try {
            if (password.length() >= 6) {
                this.password = password;
            }

        } catch (Exception ex) {
            throw new Exception("The password entered is too short");
        }
    }

    public Roller getRoller() {
        return roller;
    }

    public void setRoller(Roller roller) {
        this.roller = roller;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roller=" + roller +
                '}';
    }
}
