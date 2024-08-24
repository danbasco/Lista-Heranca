public class Main {

    public static void main(String[] args) {
        Operario operario1 = new Operario(
               "Carlos",
                "São paulo",
                "1198765432",
                1,
                1900,
                13,
                200,
                10
        );

        System.out.printf("Salário de %s: R$ %.2f\n", operario1.getNome(), operario1.calcularSalario());
        System.out.printf("Código setor: %d\n", operario1.getCodigoSetor());
        System.out.printf("Endereço: %s\n", operario1.getEndereco());
        System.out.printf("Telefone: %s\n", operario1.getTelefone());
        System.out.printf("Salário base: R$ %.2f\nImposto de %.1f%%\n", operario1.getSalarioBase(), operario1.getImposto());
        System.out.printf("Valor produção: R$ %.2f\nComissão: %.1f%%", operario1.getValorProducao(), operario1.getComissao());


    }
}
