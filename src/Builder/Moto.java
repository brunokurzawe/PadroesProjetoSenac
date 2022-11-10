package Builder;

public class Moto implements IBuilder {
    private Produto produto = new Produto();

    @Override
    public void constroiCarcaca()
    {
        produto.adicionar("Carcaça da Moto construída!");
    }

    @Override
    public void inserePneus()
    {
        produto.adicionar("2 rodas adicionadas!");
    }

    @Override
    public void adicionaFarois()
    {
        produto.adicionar("2 faróis inseridos!");
    }

    @Override
    public Produto getVeiculo()
    {
        return produto;
    }
}


