package Prototype;

import java.util.Random;

public abstract class Carro implements Cloneable {
    public String nomeModelo;
    public int preco;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public int getPreco() {
        return preco;
    }

    public static int setPreco()
    {
        int preco = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        preco = p;

        return preco;
    }

    public Carro clone() throws CloneNotSupportedException {
        return (Carro)super.clone();
    }
}


