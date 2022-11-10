package Bridge;

public class Main {

    public static void main(final String[] args) {

        // Eu gosto de programar em java, então eu posso criar um programador que executa a tarefa de programar em Java
        Tarefa tarefaDoProgramador = new ProgramacaoJava();
        final Colaborador programador = new Programador(tarefaDoProgramador);
        programador.produz();

        // Eu também gosto de Ruby então poderia desenvolver em Ruby!
        tarefaDoProgramador = new ProgramacaoRuby();
        programador.recebeTarefa(tarefaDoProgramador);
        programador.produz();

        // Mas se a situação aperta e me pedem testes automatizados, não tem problema eu posso fazer também!
        tarefaDoProgramador = new TestesAutomatizados();
        programador.recebeTarefa(tarefaDoProgramador);
        programador.produz();

        // No caso do colaborador, temos o mesmo, ele faz testes manuais
        Tarefa tarefaDoHomologador = new TesteManuais();
        final Colaborador homologador = new Homologador(tarefaDoHomologador);
        homologador.produz();

        // Mas se a situação aperta ele pode programar até em Ruby!
        tarefaDoHomologador = new ProgramacaoRuby();
        homologador.recebeTarefa(tarefaDoHomologador);
        homologador.produz();

    }
    
}
