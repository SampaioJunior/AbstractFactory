package FactoryMethod;

public class Teste {
    public static void main(String args[]) {
        FactoryPessoa factory = new FactoryPessoa();
        String nome ="Zezinho";
        int idade = 12;
        factory.getPessoa(nome, idade);

    }

}
