public class Empregado extends Pessoa{

    private int codigoSetor;
    private float salarioBase, imposto; // porcentagem

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
        super(nome, endereco, telefone);
        setCodigoSetor(codigoSetor);
        setSalarioBase(salarioBase);
        setImposto(imposto);
    }

    public Empregado(String nome, String endereco, int codigoSetor, float salarioBase, float imposto) {
        super(nome, endereco);
        setCodigoSetor(codigoSetor);
        setSalarioBase(salarioBase);
        setImposto(imposto);
    }

    public Empregado(String nome, int codigoSetor, float salarioBase, float imposto) {
        super(nome);
        setCodigoSetor(codigoSetor);
        setSalarioBase(salarioBase);
        setImposto(imposto);
    }

    public float calcularSalario(){
        return salarioBase - (salarioBase*imposto)/100;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

}
