/**
 * Etapa 2: Verifica se a parcela não ultrapassa 25% da renda mensal do cliente.
 */
public class VerificarRenda extends Verificador {

    private static final double LIMITE_PERCENTUAL = 0.25; // 25%

    @Override
    public boolean verificar(PedidoEmprestimo pedido) {
        System.out.println("[2] Verificando compatibilidade da renda...");

        double parcela = pedido.getValorDaParcela();
        double tetoPermitido = pedido.getRendaMensal() * LIMITE_PERCENTUAL;

        if (parcela > tetoPermitido) {
            System.out.printf("   REPROVADO: parcela de R$ %.2f excede 25%% da renda (R$ %.2f).%n",
                    parcela, tetoPermitido);
            return false;
        }

        System.out.printf("   OK: parcela de R$ %.2f está dentro do limite de R$ %.2f.%n",
                parcela, tetoPermitido);
        return chamarProximo(pedido);
    }
}