package ch14;

public class TakeTransTest {

    public static void main(String[] args) {

        Student studentJ = new Student("James",5000);
        Student studentT = new Student("Tomas",10000);
        Student studentE = new Student("Edward",20000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);


        studentJ.takeBus(bus100);

        Subway greensubway = new Subway(2);
        studentT.takeSubway(greensubway);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusinfo();
        greensubway.showSubwayinfo();

        bus500.showBusinfo();

        Taxi taxi1 = new Taxi("잘 간다");

        studentE.takeTaxi(taxi1);
        studentE.showInfo();
        taxi1.showTaxiInfo();




    }
}
