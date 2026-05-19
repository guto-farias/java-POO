/**
 * Handler abstrato do Chain of Responsibility.
 *
 * Cada verificador concreto vai:
 *   1) Fazer SUA verificação;
 *   2) Se passar, repassar a responsabilidade para o próximo da corrente;
 *   3) Se falhar, interromper a corrente.
 */
public abstract class Verificador {

    // Referência para o próximo elo da corrente.
    protected Verificador proximo;

    /**
     * Define quem é o próximo verificador na corrente.
     */
    public void setProximo(Verificador proximo) {
        this.proximo = proximo;
    }

    /**
     * Executa a verificação. Cada subclasse implementa a sua regra.
     * Retorna true se o pedido passou em todas as verificações até o fim da corrente.
     */
    public abstract boolean verificar(PedidoEmprestimo pedido);

    /**
     * Método auxiliar: chama o próximo da corrente, se existir.
     * Se NÃO existir próximo, significa que chegamos ao fim e tudo passou.
     */
    protected boolean chamarProximo(PedidoEmprestimo pedido) {
        if (proximo == null) {
            return true; // fim da corrente, tudo aprovado
        }
        return proximo.verificar(pedido);
    }
}