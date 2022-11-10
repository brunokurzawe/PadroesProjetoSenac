package FactoryMethod;

public class Mulher extends Pessoa{
    public Mulher(String nome) {
        this.nome = nome;
        System.out.println("Olá queridA " + this.nome);
    }
}
