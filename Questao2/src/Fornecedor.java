public class Fornecedor extends Pessoa {

    private float valorCredito;
    private float valorDivida;


    public Fornecedor(String nome, int valorCredito, int valorDivida) {
        super(nome);
        setValorCredito(valorCredito);
        setValorDivida(valorDivida);

    }

    public Fornecedor(String nome, String endereco, String telefone, int valorCredito, int valorDivida) {
        super(nome, endereco, telefone);
        setValorCredito(valorCredito);
        setValorDivida(valorDivida);

    }

    public Fornecedor(String nome, String endereco, int valorCredito, int valorDivida) {
        super(nome, endereco);
        setValorCredito(valorCredito);
        setValorDivida(valorDivida);

    }


    public float ObterSaldo() {
        return valorCredito - valorDivida;
    }


    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(int valorDivida) {
        this.valorDivida = valorDivida;
    }

    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(int valorCredito) {
        this.valorCredito = valorCredito;
    }

}
