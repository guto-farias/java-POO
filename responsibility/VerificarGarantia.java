/**
 * Etapa 4: Verifica se o cliente oferece alguma garantia.
 *
 * Observação: a falta de garantia NÃO reprova o pedido sozinha,
 * mas é uma informação importante para a liberação. Por isso aqui
 * apenas registramos a situação e seguimos.
 */
public class VerificarGarantia extends Verificador {

    @Override
    public boolean verificar(PedidoEmprestimo pedido) {
        System.out.println("[4] Verificando garantias...");

        if (pedido.possuiGarantia()) {
            System.out.println("   OK: cliente oferece garantia. Crédito facilitado.");
        } else {
            System.out.println("   AVISO: cliente não oferece garantia, mas pode prosseguir.");
        }

        return chamarProximo(pedido);
    }
}