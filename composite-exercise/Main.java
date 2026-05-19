import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TarefaSimples t1 = new TarefaSimples(
                "Criar tela login",
                "Tela com autenticação",
                LocalDate.of(2026, 5, 10)
        );

        TarefaSimples t2 = new TarefaSimples(
                "Criar API",
                "Endpoint de autenticação",
                LocalDate.of(2026, 5, 12)
        );

        TarefaComposta sprint = new TarefaComposta("Sprint 1");
        sprint.adicionar(t1);
        sprint.adicionar(t2);

        TarefaComposta projeto = new TarefaComposta("Projeto Sistema");
        projeto.adicionar(sprint);

        projeto.exibir("");
    }
}