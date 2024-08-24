public class Main {

    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor(
                "Boka",
                "Rua Paulo",
                "94582391-02",
                500,
                50);

        System.out.printf("Saldo do %s: R$ %.2f\n", fornecedor1.getNome(), fornecedor1.ObterSaldo());
        System.out.printf("Endereço: %s\n",fornecedor1.getEndereco());
        System.out.printf("Telefone: %s\n",fornecedor1.getTelefone());
        System.out.printf("Valor do crédito: R$ %.2f\n", fornecedor1.getValorCredito());
    }
}
