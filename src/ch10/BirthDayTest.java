package ch10;

public class BirthDayTest {


    public static void main(String[] args) {

        BirthDay date = new BirthDay();
        date.setYear(2019);
        date.setMonth(12);
        date.setDay(30);

        /*private이 없다면 멤버변수의 오용을 객체가 잘못 사용하는것을 노출하게 되고 객체의 어떤 역할에 대해 문제가 생길수 있다.
        date.month = 100;
        이런 값들을 private(접근제한을 막는것임) 에서 막아주고 methode에서 제어 해준다.
        쓸데없는 데이터의 오용을 막아준다.*/

        date.showDate();
    }
}
