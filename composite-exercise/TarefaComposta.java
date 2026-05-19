import java.util.ArrayList;
import java.util.List;

public class TarefaComposta implements Tarefa {
    private String titulo;
    private List<Tarefa> tarefas = new ArrayList<>();

    public TarefaComposta(String titulo) {
        this.titulo = titulo;
    }

    public void adicionar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void remover(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "+ Grupo: " + titulo);

        for (Tarefa t : tarefas) {
            t.exibir(indentacao + "  ");
        }
    }
}