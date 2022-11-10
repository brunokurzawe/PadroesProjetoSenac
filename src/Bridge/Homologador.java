package Bridge;

public class Homologador implements Colaborador {

    private Tarefa tarefa;

    public Homologador(final Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void produz() {
        System.out.println("Homologador trabalhando ");
        tarefa.realiza();
    }

    @Override
    public void recebeTarefa(final Tarefa tarefa) {
        this.tarefa = tarefa;
    }

}

