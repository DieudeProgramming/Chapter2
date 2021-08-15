package ch09;

public class Student {

    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    //생성자 만들고
    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        //생성해야함 사용하기 전에 생성해야함
        korea = new Subject();
        math = new Subject();

    }

    public void setKoreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }

    public void showScore(){
        int total = korea.score + math.score;
        System.out.println(studentName +"학생의 총점은 "+ total + "입니다.");
    }
}
