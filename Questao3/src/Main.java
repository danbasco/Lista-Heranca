public class Main {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado(
               "Ivan Petróvich",
                "Petersburgo",
                "4845673053",
                73,
                1900,
                13
        );

        System.out.printf("Salário de %s: R$ %.2f\n", empregado1.getNome(), empregado1.calcularSalario());
        System.out.printf("Código setor: %d\n", empregado1.getCodigoSetor());
        System.out.printf("Endereço: %s\n", empregado1.getEndereco());
        System.out.printf("Telefone: %s\n", empregado1.getTelefone());
        System.out.printf("Salário base: R$ %.2f\nImposto de %.1f%%", empregado1.getSalarioBase(), empregado1.getImposto());


    }
}
