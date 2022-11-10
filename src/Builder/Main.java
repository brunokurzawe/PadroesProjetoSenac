package Builder;

public class Main {

    public static void main(String[] args) {

        Diretor director = new Diretor();
        IBuilder carroBuilder = new Carro();
        IBuilder motoBuilder = new Moto();

        //Construindo o Carro
        director.construir(carroBuilder);
        Produto p1 = carroBuilder.getVeiculo();
        p1.exibir();

        //Construindo a Moto
        director.construir(motoBuilder);
        Produto p2 = motoBuilder.getVeiculo();
        p2.exibir();
    }

}



