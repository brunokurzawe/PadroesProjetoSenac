package FactoryMethod;

public class FactoryPessoa {
    public Pessoa getPessoa(String nome, String sexo) {
        if (sexo.equals("M"))
            return new Homem(nome);
        else
            return new Mulher(nome);
    }
}



