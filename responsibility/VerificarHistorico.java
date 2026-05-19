/**
 * Etapa 3: Verifica se o cliente possui restrição no SPC/SERASA.
 */
public class VerificarHistorico extends Verificador {

    @Override
    public boolean verificar(PedidoEmprestimo pedido) {
        System.out.println("[3] Verificando histórico de crédito (SPC/SERASA)...");

        if (pedido.possuiRestricaoSPC()) {
            System.out.println("   REPROVADO: cliente possui restrição no SPC/SERASA.");
            return false;
        }

        System.out.println("   OK: cliente não possui restrições.");
        return chamarProximo(pedido);
    }
}