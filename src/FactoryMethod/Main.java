package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        FactoryPessoa factory = new FactoryPessoa();
        String nome = "Carlos";
        String sexo = "F";
        factory.getPessoa(nome, sexo);
    }
}


