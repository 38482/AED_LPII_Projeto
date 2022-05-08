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

    private String type;
    private Tags tag;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    /**
     * Adiciona um Node que proveio dum ficheiro
     * @param n - Node
     */
    public void addNodeFile(Node n){
        if(node.equals(n)){ // Verifica que o ID recebido do file se está ocupado
            System.out.println("O Node ja esta inserido.\n");
            return;
        }
        if(!node.equals(n)){
            node.addEdge(n.id, n.index);
        }
    }

    /**
     * Adiciona um Node
     * @param id - ID do node
     * @param longitude - Longitude do node
     * @param latitude - Latitude do node
     * @param nome - Nome dado ao node
     * @param type - Tipo de node
     */
    public void addNode(int id,int index, long longitude, long latitude, String nome, String type){
        if(node.equals(id)){
            System.out.println("O ID inserido ja esta a ser usado\n");
            return;
        }
        Node new_node = new Node(nome, id, latitude, longitude, index);
        if(!node.equals(new_node)){
            new_node.tag.addTagNode(new_node, type); // Coloca o tipo de node que é.
            node.addEdge(new_node.id, new_node.index);
        }
    }

    /**
     * Remove um node
     * @param n - Node a ser apagado
     */
    public void removeNode(Node n){
        if(!node.equals(n)){
            System.out.println("Nao existe o node\n");
        } else{
        }
    }

    /**
     * Procura pelo node
     * @param n - Node a ser procurado
     */
    public void searchNode(Node n){

    }
}
