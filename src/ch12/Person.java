package ch12;

public class Person {

    String name;
    int age;

    public Person(){
        // 디폴트 constructer , 아무것도 저장안했을때 초기화 시키고 싶다 (밑에보시오)
        /*int num = 10;
        name = "test";
        이렇게는 위에다가는 쓸수 없다. 밑에 있는 this(다른생성자를 호출하는) 가 제일 먼저 와야함*/
        this("no name", 1);// 중복해서 쓰지 않고 밑에 생성자를 부른다

    }

    // 이름과 나이를 매개로 받는 constructer
    public Person(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name + "," + age);
    }

    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        //생성자 생성되면서 디폴트 constructer 불러짐
        Person person = new Person();//여기서 생성된 얘하고 29에서 잔환해주는this의 값하고 같은 값이다
        person.showPerson();

        System.out.println(person);//이렇게 하면 인스턴스의 adress가 나온다

        Person person2 = person.getPerson();
        System.out.println(person2);

    }
}


