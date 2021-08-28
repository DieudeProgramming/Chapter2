package ch11;

public class MakeReport {
    //StringBuffer는 String을 + 로 이어도 되지만 쭉 버퍼를 하고 리턴을 해줄수도 있다. StringBuilder 도 많이 쓰임.
    StringBuffer buffer = new StringBuffer();

    private String line = "=============================================\n";
    private String title = "   이름 \t    주소 \t\t    전화번호 \n";


    private void makeHeader(){
        //append를 쓰면 쭉 연결할수 있다.
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        //그다지 좋지 않은 방법. 배열을쓰면 더 쉽고 간단하게 할수있다.
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t\t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter(){
        buffer.append(line);
    }
    //얘만 public Heqder Body Footer 는 다 private
    public String getReport(){
        //클라이언트는 순서 신경도안씀(하지만순서는중요함). 그냥 이 메서드만 제공하면 레포트가 제공될수 있도록 해준다.
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }



}
