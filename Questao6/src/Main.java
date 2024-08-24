public class Main {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(
               "Miguel",
                "Nova Zelândia, Rua 43",
                "4845673053",
                30,
                1900,
                13,
                200,
                10
        );

        System.out.printf("Salário de %s: R$ %.2f\n", vendedor1.getNome(), vendedor1.calcularSalario());
        System.out.printf("Código setor: %d\n", vendedor1.getCodigoSetor());
        System.out.printf("Endereço: %s\n", vendedor1.getEndereco());
        System.out.printf("Telefone: %s\n", vendedor1.getTelefone());
        System.out.printf("Salário base: R$ %.2f\nImposto de %.1f%%\n", vendedor1.getSalarioBase(), vendedor1.getImposto());
        System.out.printf("Valor produção: R$ %.2f\nComissão: %.1f%%", vendedor1.getValorVendas(), vendedor1.getComissao());


    }
}
