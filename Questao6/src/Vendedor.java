public class Vendedor extends Empregado {

    private float valorVendas, comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float valorVendas, float comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setValorVendas(valorVendas);
        setComissao(comissao);
    }

    public Vendedor(String nome, String endereco, int codigoSetor, float salarioBase, float imposto, float valorVendas, float comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        setValorVendas(valorVendas);
        setComissao(comissao);
    }

    public Vendedor(String nome, int codigoSetor, float salarioBase, float imposto, float valorVendas, float comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        setValorVendas(valorVendas);
        setComissao(comissao);
    }

    private float calcularComissao() {
        return (valorVendas * comissao)/100;
    }


    @Override
    public float calcularSalario(){
        this.setSalarioBase(this.getSalarioBase() + calcularComissao());
        return super.calcularSalario();
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }

}
