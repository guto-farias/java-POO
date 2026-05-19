/**
 * Etapa 1: Verifica se o banco tem crédito disponível para conceder o empréstimo.
 */
public class VerificarCredito extends Verificador {

    @Override
    public boolean verificar(PedidoEmprestimo pedido) {
        System.out.println("[1] Verificando disponibilidade de crédito do banco...");

        if (pedido.getValorSolicitado() > pedido.getCreditoDisponivelBanco()) {
            System.out.println("   REPROVADO: o banco não possui crédito suficiente no momento.");
            return false;
        }

        System.out.println("   OK: banco possui crédito disponível.");
        return chamarProximo(pedido); // passa adiante na corrente
    }
}