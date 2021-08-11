package practice.humain;

public class Humain {

    int taille;
    int poids;
    int age;
    String sex;
    String nom;


    public Humain(){}

    //또 다른 방식, 일단 받을 매개변수를 괄호안에 넣고 humain 02
    public Humain(int taille, int poids, int age, String sex, String nom){
        this.taille = taille;
        this.poids = poids;
        this.age = age;
        this.sex = sex;
        this.nom = nom;
    }

    public String showHumainInfo(){
        return "이 회원의 이름은 " + nom + "이고, 키는 " + taille + ", 성별은 " + sex + ", 몸무게는 " + poids + "이며, 나이는 " + age + " 입니다.";
    }


}
