package ch10;

public class BirthDay {
//멤버 변수는 디폴트 값을 받는다 예를 들면 int는 0 boolean은 false
    //private이라 변수로 직접 지정 하지 못한다
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    // alt + insert : generate getter and setter !
    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month <1 || month > 12){
            isValid = false;
        }else{
        isValid = true;
        this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate(){
        if(isValid){
            System.out.println( year + "년" + month + "월" + day + "일 입니다"  );
        }
        else{
            System.out.println("유효하지않은 날짜 입니다");
        }
    }

    //혹시라도 밖에서 isValid를 알고 싶다고 하면 읽어갈수는 있지만 쓸수는 없다.*
    
    public boolean getIsValid(){
        return isValid;
    }

}
