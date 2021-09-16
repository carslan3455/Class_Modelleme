public class Main {

    public static void main(String[] args) throws Exception {

        Discord kurs_1 = new Discord("SDET");

        Teacher teacher_1 = new Teacher("Ismet","Temur","ismet","ismet123",Roller.TEACHER,15);

        Mentor mentor_1 = new Mentor("Cigdem","Arslan","carslan","cigdem123",Roller.MENTOR,1);
        Mentor mentor_2 = new Mentor("Hakan","Demir","hdemir","hakan123",Roller.MENTOR,1);
        Mentor mentor_3 = new Mentor("Ömer","Özdemir","odemir","omer123",Roller.MENTOR,2);
        Mentor mentor_4 = new Mentor("Burak","Türkmen","burakT","burak123",Roller.MENTOR,2);

        Student student_1 = new Student("Mesut","D","mesut","mesut123",Roller.STUDENT,10);
        Student student_2 = new Student("Sevim","A","sevim","sevim123",Roller.STUDENT,15);

        kurs_1.addTeacher(teacher_1);
        kurs_1.addMentor(mentor_1);
        kurs_1.addMentor(mentor_2);
        kurs_1.addMentor(mentor_3);
        kurs_1.addMentor(mentor_4);
        kurs_1.addStudent(student_1);
        kurs_1.addStudent(student_2);

//        kurs_1.getMentor();
//        System.out.println("----------------------------------");
////        System.out.println(kurs_1);
//
//        kurs_1.deleteMentor(mentor_1);
//
        kurs_1.getMentor();

        System.out.println(" --------------");

        //kurs_1.getStudent();

        kurs_1.deleteMentor(mentor_2);
        kurs_1.getMentor();


        Student student_3 = new Student("Ragip","S","ragip","ragip.123",Roller.STUDENT,25);

        kurs_1.addStudent(student_3);

        kurs_1.getStudent();
    }
}
