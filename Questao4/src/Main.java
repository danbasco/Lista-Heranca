public class Main {

    public static void main(String[] args) {
        Administrador administrador1 = new Administrador(
               "Dora",
                "Salvador",
                "7199350148",
                12,
                1900,
                13,
                2100
        );

        System.out.printf("Salário de %s: R$ %.2f\n", administrador1.getNome(), administrador1.calcularSalario());
        System.out.printf("Código setor: %d\n", administrador1.getCodigoSetor());
        System.out.printf("Endereço: %s\n", administrador1.getEndereco());
        System.out.printf("Telefone: %s\n", administrador1.getTelefone());
        System.out.printf("Salário base: R$ %.2f\nImposto de %.1f%%\n", administrador1.getSalarioBase(), administrador1.getImposto());
        System.out.printf("Ajuda de custo: R$ %.2f\n", administrador1.getAjudaDeCusto());


    }
}
