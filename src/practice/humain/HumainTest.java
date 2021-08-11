package practice.humain;

public class HumainTest {

    public static void main(String[] args){

        Humain humain01 = new Humain();
        humain01.taille = 180;
        humain01.sex = "남성";
        humain01.poids = 80;
        humain01.nom = "Tomas";
        humain01.age = 37;

        System.out.println(humain01.showHumainInfo());

        //또 다른 방식으로 나타낼때의 방식
        Humain humain02 = new Humain(182,82,28,"남성","Léonard");
        System.out.println(humain02.showHumainInfo());
    }
}
