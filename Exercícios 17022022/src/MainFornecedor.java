import java.util.Scanner;

public class MainFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os dados solicitados: ");
        System.out.println("Nome: ");
        fornecedor1.setNome(scanner.nextLine());
        System.out.println("Endereço: ");
        fornecedor1.setEndereco(scanner.nextLine());
        System.out.println("Telefone: ");
        fornecedor1.setTelefone(scanner.nextLine());
        System.out.println("Valor do Crédito: R$ ");
        fornecedor1.setValorCredito(scanner.nextDouble());
        System.out.println("Valor da Dívida: R$ ");
        fornecedor1.setValorDivida(scanner.nextDouble());


        System.out.println(fornecedor1.toString());
        fornecedor1.obtemSaldo();
    }
}
