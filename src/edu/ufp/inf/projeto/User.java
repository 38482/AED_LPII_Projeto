package edu.ufp.inf.projeto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class User implements Register{
    private String name;

    private int age;

    private int id;

    private String type;

    private int tag;

    public HashMap<User, Integer> user = new HashMap<>(); // User e tag

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTag(){
        return tag;
    }
    public void setTag(int tag){this.tag = tag;}
    public User(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Adicionar no HashMap<User, Integer> user o utilizador obtido do ficheiro
     * @param u - Obtem o valor do User do ficheiro
     */
    public void addUserFile(User u){
        if(user.containsValue(u.getId())){ // Verifica que o ID recebido do file se está ocupado
            System.out.println("O usuario ja esta inserido.\n");
            return;
        }
        if(!user.containsKey(u)){
            user.put(u, u.getId());
        }
    }

    /**
     * Grava o utilizador no HashMap<User, Integer> user
     * id - ID do utilizador
     * type - Tipo do utilizador (basico, premium, admistrador)
     * name - Nome do utilizador
     */
    public void addUser(){
        Scanner read = new Scanner(System.in);
        int id;
        String type;
        String name;
        System.out.println("Id do usuario a inserir:");
        id=read.nextInt(); // Le a linha com o ID inserido
        if(user.containsValue(id)){ // Verifica se na BST o ID está inserido
            System.out.println("O ID inserido ja esta a ser usado para um usuario\n");
            return;
        }
        System.out.println("Tipo de usuario a inserir (basico, premium ou admin):");
        type=read.nextLine();
        System.out.println("Nome do usuario:");
        name=read.nextLine();
        User new_user = new User(type, name);
        if(!user.containsKey(new_user)){ // Se não tiver a chave da nova cache, é inserida
            user.put(new_user, new_user.getId());
        }
    }

    /**
     * Remove o utilizador do HashMap<User, Integer> user
     * id - Numero do ID do utilizador
     */
    public void removeUser(){
        int id;
        Scanner read = new Scanner(System.in);
        Iterator<Map.Entry<User, Integer>> iterator = user.entrySet().iterator();
        System.out.println("ID do usuario a remover:");
        id=read.nextInt();
        while (iterator.hasNext()){ // Enquanto que houver valores no HashMap continuara a procurar
            Map.Entry<User, Integer> entry = iterator.next();
            if(id == entry.getValue()){ // O valor foi encontrado
                iterator.remove(); // A chave em conjunto com o valor e removido
            }
        }
    }

    /**
     * Edita o utilizador que se encontra no HashMap<User, Integer> user
     * id - ID do utilizador
     * type - Tipo do utilizador (basico, premium, admistrador)
     * name - Nome do utilizador
     */
    public void editUser(){
        int id;
        String type;
        String name;
        Scanner read = new Scanner(System.in);
        System.out.println("Insira o ID do usuario a editar:");
        id=read.nextInt();
        if(user.containsValue(id)){
            System.out.println("""
                    O que é para editar?
                    1 - Nome do Usuario.
                    2 - Tipo do Usuario.
                    """);
            String option;
            option=read.nextLine();
            switch (option) {
                case "1" -> {
                    System.out.println("Nome do Usuario:");
                    name = read.nextLine();
                    type = this.type;
                    id = this.id;
                    User edited_user = new User(type, name);
                    user.put(edited_user, id);
                }
                case "2" -> {
                    System.out.println("Tipo do Usuario:");
                    type = read.nextLine();
                    name = this.name;
                    id = this.id;
                    User edited_user2 = new User(type, name);
                    user.put(edited_user2, id);
                }
            }
        }
    }
    public void readFile(){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void searchUser(User u){
        if(user.containsKey(u)){
            System.out.println("Esta contido na lista de usuarios\n");
            System.out.println("Nome: "+ u.name +"\n Tipo de usuario: "+u.type+ "\n");
        } else{
            System.out.println("Não está contido na lista de usuarios\n");
        }
    }
}
