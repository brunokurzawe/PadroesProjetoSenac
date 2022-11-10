package Singleton;

public class Janela {
    private static final Janela INSTANCE = new Janela();
    private static Boolean janelaAberta = false;

    private Janela() {
    }

    public static Janela getInstance() {
        return INSTANCE;
    }

    public void abrir() {
        if (janelaAberta)
            System.out.println("Janela já esta aberta");
        janelaAberta = true;
    }

    public void fechar() {
        if (!janelaAberta)
            System.out.println("Janela já esta fechada");
        janelaAberta = false;
    }
}





