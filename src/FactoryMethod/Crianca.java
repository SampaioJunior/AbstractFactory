package FactoryMethod;

public class Crianca extends Pessoa{
    public Crianca(String nome) {
        this.nome = nome;
        System.out.println("Bom dia Crianca: "+ this.nome);
    }
}
