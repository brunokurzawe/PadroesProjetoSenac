package Bridge;

public class Programador implements Colaborador {

    private Tarefa tarefa;

    public Programador(final Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void produz() {
        System.out.println("Programador trabalhando ");
        tarefa.realiza();
    }

    @Override
    public void recebeTarefa(final Tarefa tarefa) {
        this.tarefa = tarefa;
    }

}