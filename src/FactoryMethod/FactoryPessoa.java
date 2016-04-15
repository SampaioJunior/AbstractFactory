package FactoryMethod;

public class FactoryPessoa {
    public void getPessoa(String nome, int idade) {
        if (idade <= 12) {
            System.out.println(new Crianca(nome));

        }
        if (idade > 60) {
            System.out.println(new Idoso(nome));
        }
    }
}
