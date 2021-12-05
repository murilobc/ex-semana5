package br.senai.ex02;

public class Usuario {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Usuario() {
        this("Usuário Vázio", "email@vazio.com");
    }
}
