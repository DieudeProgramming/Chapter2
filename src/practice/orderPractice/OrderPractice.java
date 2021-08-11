package practice.orderPractice;

public class OrderPractice {

    long orderNumber;
    int phoneNumber;
    String adress;
    int orderDate;
    int orderTime;
    int orderPrice;
    int menuNumber;

    public String showOrder(){
        return "주문 접수 번호:"+orderNumber+"\n주문 핸드폰 번호:"+phoneNumber+"\n주문 집 주소:"+adress+"\n주문 날짜:"+orderDate+
                "\n주문 시간:"+orderTime+"\n주문 가격:"+orderPrice+"\n메뉴 번호:"+menuNumber;
    }

    public OrderPractice(){};

    public OrderPractice(long orderNumber,int phoneNumber,String adress, int orderDate, int orderTime, int orderPrice, int menuNumber){
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;
    }

}
