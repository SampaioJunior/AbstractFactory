package FactoryMethod;

public class Idoso extends Pessoa {
    public Idoso(String nome) {
        this.nome = nome;
        System.out.println("O que que h� velhino: " + this.nome);
    }
}
