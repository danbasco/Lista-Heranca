public class Administrador extends Empregado{

    private float ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        setAjudaDeCusto(ajudaDeCusto);
    }

    public Administrador(String nome, String endereco, int codigoSetor, float salarioBase, float imposto, float ajudaDeCusto) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        setAjudaDeCusto(ajudaDeCusto);
    }

    public Administrador(String nome, int codigoSetor, float salarioBase, float imposto, float ajudaDeCusto) {
        super(nome, codigoSetor, salarioBase, imposto);
        setAjudaDeCusto(ajudaDeCusto);
    }

    @Override
    public float calcularSalario(){
        return super.calcularSalario() + ajudaDeCusto;
    }



    public float getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

}
