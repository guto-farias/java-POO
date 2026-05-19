import java.time.LocalDate;

public class TarefaSimples implements Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate prazo;

    public TarefaSimples(String titulo, String descricao, LocalDate prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "- Tarefa: " + titulo);
        System.out.println(indentacao + "  Descrição: " + descricao);
        System.out.println(indentacao + "  Prazo: " + prazo);
    }
}