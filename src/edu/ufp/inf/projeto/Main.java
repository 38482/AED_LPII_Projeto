package edu.ufp.inf.projeto;

import edu.princeton.cs.algs4.*;
//import edu.princeton.cs.algs4.RedBlackBST;
import java.io.FileNotFoundException;
import java.util.ArrayList;

enum type_vehicle{
    bus,
    bycicle,
    public_transport
}
enum building{
    hotel,
    kiosk,
    supermarket,
    parking
}
enum type_user{
    basic,
    admin,
    premium
}
public class Main {

    public static void main(String[] args) {
        Node node;
        Ways ways = new Ways();
        RedBlackBST<Integer, User> file_user = new RedBlackBST<>();
    }
}