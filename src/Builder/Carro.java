package Builder;

public class Carro implements IBuilder {
    private Produto produto = new Produto();

    @Override
    public void constroiCarcaca()
    {
        produto.adicionar("Carcaça do Carro construída!");
    }

    @Override
    public void inserePneus()
    {
        produto.adicionar("4 rodas adicionadas!");
    }

    @Override
    public void adicionaFarois()
    {
        produto.adicionar("6 faróis inseridos!");
    }

    @Override
    public Produto getVeiculo()
    {
        return produto;
    }
}

