package com.mycompany.vetor;


public class Contato {

    private String nome;
    private String telefone;
    private String email;

    //Construtor
    public Contato() {
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    //Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Apresenta resultado
    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
}