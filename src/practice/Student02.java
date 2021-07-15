package practice;

public class Student02 {

    int studentID;
    String studentName;
    String address;


    public void setStudentName(String name){ studentName = name; }
    public String getStudentName(){ return studentName; }
    public void showStudentInfo02(){System.out.println(studentID + "의 이름은" + studentName + "주소는" + address + "입니다");
    }
}
