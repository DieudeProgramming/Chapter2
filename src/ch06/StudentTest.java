package ch06;

public class StudentTest {

    public static void main(String[] args){

        Student studentLee = new Student();
        /*디폴트 생성자가(new Student) 작동하는 이유는 클래스에
        생성자가 없는 경우이다. 쓰고싶으면 클래스에 직접 디폴트 생성자를 만들어라*/
        studentLee.grade  = 3;
        studentLee.studentName = "Lee";
        studentLee.studentNumber = 33455;

        System.out.println(studentLee.showStudentInfo());
        //멤버변수는 만들어지면 자동으로 초기화 된다.

        Student studentKim = new Student(1234,"kim",3);
        System.out.println(studentKim.showStudentInfo());
    }
}
