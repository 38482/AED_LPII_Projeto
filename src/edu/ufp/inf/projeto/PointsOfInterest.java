package edu.ufp.inf.projeto;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.HashMap;
import java.util.Scanner; // Import the Scanner class to read text files
public class PointsOfInterest{
    private String nome;
    private String type;
    private int id;
    int numero_existente;

    public PointsOfInterest(String nome, String type, int id, int numero_existente) {
        this.nome = nome;
        this.type = type;
        this.id = id;
        this.numero_existente = numero_existente;
    }

    public int getNumero_existente() {
        return numero_existente;
    }

    public void setNumero_existente(int numero_existente) {
        this.numero_existente = numero_existente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
