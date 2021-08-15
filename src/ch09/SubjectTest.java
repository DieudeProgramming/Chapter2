package ch09;

public class SubjectTest {

    public static void main(String[] args){

        Student studentLee = new Student(100,"LEE");
        studentLee.setKoreaSubject("국어",50);
        studentLee.setMathSubject("수학",60);

        Student studentKim = new Student(200,"KIM");
        studentKim.setKoreaSubject("국어",100);
        studentKim.setMathSubject("수학",99);

        studentLee.showScore();
        studentKim.showScore();

    }
}
