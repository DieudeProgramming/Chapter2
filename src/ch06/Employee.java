package ch06;

public class Employee {

    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String departement;

    public Employee(){
        //디폴트생성자 안에도 필요하면 코드를 넣을수 있다.
        serialNum++;
        //이 변수는 공유할수 없다 그럼 어떻게 해야하는가 ? 멤버변수에다 복사해수면 됨
        employeeId = serialNum;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }


}
