package Singleton;

public class Casa {

    private Janela janela;

    public Casa() {
        this.janela = Janela.getInstance();
        janela.fechar();
    }
}


