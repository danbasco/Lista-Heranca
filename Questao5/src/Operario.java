public class Operario extends Empregado{

    private float valorProducao, comissao;

    public Operario(String nome, int codigoSetor, float salarioBase, float imposto, float valorProducao, float comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        setValorProducao(valorProducao);
        setComissao(comissao);
    }

    public Operario(String nome, String endereco, int codigoSetor, float salarioBase, float imposto, float valorProducao, float comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        setValorProducao(valorProducao);
        setComissao(comissao);
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float valorProducao, float comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setValorProducao(valorProducao);
        setComissao(comissao);
    }

    private float calcularComissao() {
        return (valorProducao * comissao)/100;
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

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }
}
