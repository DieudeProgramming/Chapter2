package ch08Practice.order;

public class OrderTest {

    public static void main(String[] args){

        Order premierOrder = new Order();

        premierOrder.numeroDeOrder = 3337;
        premierOrder.numeroDeProduit = 2143;
        premierOrder.setNomdeClient("HADJI");
        premierOrder.clientID = "g.hadji@hotmail.fr";

        premierOrder.MontreOrder();
        String nomDeClient = premierOrder.getNomDeClient();
        System.out.println(nomDeClient);

    }
}
