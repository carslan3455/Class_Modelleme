public class Teacher extends Person {
    private int lessonTime ;

    public Teacher(String firstName, String lastName, String userName, String password, Roller roller, int lessonTime) {
        super(firstName, lastName, userName, password, roller);
        setLessonTime(lessonTime);
    }

    public int getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(int lessonTime) {
        this.lessonTime = lessonTime;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "lessonTime=" + lessonTime +
                '}';
    }
}
