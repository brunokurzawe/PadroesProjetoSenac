package Singleton;

public class Main {
    public static void main(String[] args) {
        Janela janela = Janela.getInstance();

        janela.abrir();
        janela.fechar();

        Casa casa = new Casa();
    }
}


