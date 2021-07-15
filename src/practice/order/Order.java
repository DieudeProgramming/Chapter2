package practice.order;

public class Order {

    int numeroDeOrder;
    int numeroDeProduit;
    String nomDeClient;
    String clientID;

    public void setNomdeClient(String nom){
        nomDeClient = nom;
    }

    public String getNomDeClient() {
        return nomDeClient;
    }


    public void MontreOrder(){
        System.out.println(numeroDeOrder + "a commendé" + numeroDeProduit + "Nom : " + nomDeClient + "ClientID" +
                clientID);
    }

}
