package edu.ufp.inf.projeto;
import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.ST;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;

public class Node {
    private String nome;
    private int id;
    private long latitude;
    private long longitude;
    private int index;

    public PointsOfInterest poi;
    //EdgeWeightedGraph node;
    //ArrayList<ArrayList<Node>> node = new ArrayList<ArrayList<Node>>();
    public Graph node; // Node e ID deste

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Node(String nome, int id, long latitude, long longitude, int index) {
        this.nome = nome;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.index = index;
    }
    public void addNodeFile(Node n){
        if(node.equals(n)){ // Verifica que o ID recebido do file se está ocupado
            System.out.println("O Node ja esta inserido.\n");
            return;
        }
        if(!node.equals(n)){
            node.addEdge(n.id, n.index);
        }
    }
    public void addNode(){
        Scanner read = new Scanner(System.in);
        int id, index;
        long longitude, latitude;
        String nome, poi;
        System.out.println("ID do node a inserir:");
        id=read.nextInt(); // Le a linha com o ID inserido
        if(node.equals(id)){
            System.out.println("O ID inserido ja esta a ser usado\n");
            return;
        }
        System.out.println("Index:");
        index= Integer.parseInt(read.nextLine());
        System.out.println("Longitude:");
        longitude= Integer.parseInt(read.nextLine());
        System.out.println("Latitude:");
        latitude= Integer.parseInt(read.nextLine());
        System.out.println("Nome:");
        nome=read.nextLine();
        System.out.println("Tipo de Ponto de Interesse:");
        poi=read.nextLine();
        Node new_node = new Node(nome, id, latitude, longitude, index);
        if(!node.equals(new_node)){ // Se não tiver a chave da nova cache, é inserida
            node.addEdge(new_node.id, new_node.index);
        }
    }
    public void removeNode(Node n){
        if(!node.equals(n)){
            System.out.println("Nao existe o node\n");
        } else{
        }
    }
    public void searchNode(Node n){

    }
}
