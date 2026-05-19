/**
 * Classe que monta a corrente (Chain of Responsibility) e testa o fluxo
 * com dois cenários: um pedido aprovado e um pedido reprovado.
 */
public class Main {

    public static void main(String[] args) {

        // ---- Montagem da corrente ----
        // Ordem: Crédito -> Renda -> Histórico -> Garantia
        Verificador credito   = new VerificarCredito();
        Verificador renda     = new VerificarRenda();
        Verificador historico = new VerificarHistorico();
        Verificador garantia  = new VerificarGarantia();

        credito.setProximo(renda);
        renda.setProximo(historico);
        historico.setProximo(garantia);
        // garantia é o último, não tem próximo

        // ---- Cenário 1: pedido que deve ser APROVADO ----
        System.out.println("============================================");
        System.out.println("CENÁRIO 1 - Pedido com chances de aprovação");
        System.out.println("============================================");
        PedidoEmprestimo pedidoAprovado = new PedidoEmprestimo(
                10_000.00,   // valor solicitado
                24,          // 24 parcelas -> R$ 416,67/mês
                3_000.00,    // renda mensal (25% = R$ 750, parcela cabe)
                false,       // sem restrição
                true,        // possui garantia
                500_000.00   // crédito disponível no banco
        );
        boolean resultado1 = credito.verificar(pedidoAprovado);
        System.out.println("Resultado final: " + (resultado1 ? "APROVADO" : "REPROVADO"));

        // ---- Cenário 2: pedido que deve ser REPROVADO ----
        System.out.println();
        System.out.println("============================================");
        System.out.println("CENÁRIO 2 - Pedido que deve ser reprovado");
        System.out.println("============================================");
        PedidoEmprestimo pedidoReprovado = new PedidoEmprestimo(
                50_000.00,   // valor alto
                12,          // 12 parcelas -> ~R$ 4.166,67/mês
                2_000.00,    // renda baixa -> parcela ultrapassa 25%
                true,        // tem restrição no SPC
                false,       // sem garantia
                500_000.00
        );
        boolean resultado2 = credito.verificar(pedidoReprovado);
        System.out.println("Resultado final: " + (resultado2 ? "APROVADO" : "REPROVADO"));
    }
}