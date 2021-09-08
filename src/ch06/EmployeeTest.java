package ch06;

public class EmployeeTest {

    public static void main(String[] args) {

        //디폴트 컨스터럭터를 이용해서 인스턴스 생성
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("LEEU");

        //employeeLee일때 노란줄이 나온이유는 얘는 스태틱변수니까 클래스 이름으로 참조해서 써라 라고해서
        System.out.println(Employee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("KIMU");


        System.out.println(employeeLee.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());
        //두개의 인스턴스가 하나의 메모리를 공유한다는 것을 알수있다.
    }




}
