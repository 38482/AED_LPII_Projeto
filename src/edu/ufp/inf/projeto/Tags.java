package edu.ufp.inf.projeto;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Objects;
import java.util.Scanner; // Import the Scanner class to read text files
public class Tags {
    enum type_vehicle{
        bus,
        bycicle,
        public_transport
    }
    enum type_building{
        hotel,
        kiosk,
        supermarket,
        parking
    }
    enum type_user{
        basic,
        admin
    }
    enum type_node{
        road,
        avenue
    }

    /**
     * Adiciona um Tag ao node
     * @param n - Node
     * @param type - Tag a adicionar ao Node
     */
    public void addTagNode(Node n, String type){
        if(Objects.equals(type, "Road") || Objects.equals(type, "road")){
            n.setType(String.valueOf(type_node.road));
        }
        if(Objects.equals(type, "Avenue") || Objects.equals(type, "avenue")){
            n.setType(String.valueOf(type_node.avenue));
        }
    }

    /**
     * Adiciona um Tag ao usuario
     * @param u - Usuario em questão
     * @param type - Tipo de usuário
     */
    public void addTagUser(User u, String type){
        if(Objects.equals(type, "Admin")  || Objects.equals(type, "admin")){
            u.setType(String.valueOf(type_user.admin));
        }
        if(Objects.equals(type, "Basic")  || Objects.equals(type, "basic")){
            u.setType(String.valueOf(type_user.basic));
        }
    }
    /**
     * Adiciona um Tag a um ponto de interesse
     * @param p - Obtem o Ponto de interesse correspondente
     * @param type1 - Obtem o tipo de interesso (veiculo ou edificio)
     * @param type2 - Obtem de forma mais especifica o ponto de interesse
     */
    public void addTagPointOfInterest(PointsOfInterest p, String type1, String type2){

    }

}
