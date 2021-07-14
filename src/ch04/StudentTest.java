package ch04;

public class StudentTest {

    public static void main(String[] args){

        Student studentlee = new Student();
        //이렇게 생성되는 객체를 인스턴스라고 부르자.

        studentlee.studentID = 12345;
        studentlee.setStudentName("Lee");
        studentlee.address="Seoul";

        studentlee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.studentName= "KIM";
        studentKim.address = "Daegu";

        studentKim.showStudentInfo();
        System.out.println(studentKim);
        System.out.println(studentlee);

    }
}
