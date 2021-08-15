package ch08Practice.orderPractice;

public class OrderPracticeTest {

    public static void main(String[] args) {
        OrderPractice order01 = new OrderPractice();
        order01.orderNumber = 202011020003L;
        order01.phoneNumber = 01034560001;
        order01.adress = "서울시 강남구 역삼동 111-333";
        order01.orderDate = 130258;
        order01.orderTime = 35000;
        order01.menuNumber = 0003;
        order01.orderPrice = 3200;

        System.out.println(order01.showOrder());

        OrderPractice order02 = new OrderPractice(202011033L,010342223333,"8rue gorges goyau",1302599,34000,3000,0002);
        System.out.println(order02.showOrder());
    }


}
