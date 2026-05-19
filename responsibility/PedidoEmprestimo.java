/**
 * Representa o pedido de empréstimo do cliente.
 * É o "objeto da requisição" que será passado por toda a corrente de verificações.
 */
public class PedidoEmprestimo {

    private double valorSolicitado;     // valor do empréstimo
    private int numeroParcelas;         // em quantas parcelas será pago
    private double rendaMensal;         // renda mensal do cliente
    private boolean possuiRestricaoSPC; // o cliente tem nome sujo?
    private boolean possuiGarantia;     // o cliente oferece algum bem como garantia?
    private double creditoDisponivelBanco; // crédito que o banco tem disponível no momento

    public PedidoEmprestimo(double valorSolicitado,
                            int numeroParcelas,
                            double rendaMensal,
                            boolean possuiRestricaoSPC,
                            boolean possuiGarantia,
                            double creditoDisponivelBanco) {
        this.valorSolicitado = valorSolicitado;
        this.numeroParcelas = numeroParcelas;
        this.rendaMensal = rendaMensal;
        this.possuiRestricaoSPC = possuiRestricaoSPC;
        this.possuiGarantia = possuiGarantia;
        this.creditoDisponivelBanco = creditoDisponivelBanco;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public boolean possuiRestricaoSPC() {
        return possuiRestricaoSPC;
    }

    public boolean possuiGarantia() {
        return possuiGarantia;
    }

    public double getCreditoDisponivelBanco() {
        return creditoDisponivelBanco;
    }

    /**
     * Calcula o valor de cada parcela do empréstimo.
     */
    public double getValorDaParcela() {
        return valorSolicitado / numeroParcelas;
    }
}