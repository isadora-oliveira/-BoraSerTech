import java.util.Scanner;

public class MainAdministrador {
    public static void main(String[] args) {
        Administrador administrador1 = new Administrador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os dados do administrador: ");
        System.out.println("Nome: ");
        administrador1.setNome(scanner.nextLine());
        System.out.println("Telefone: ");
        administrador1.setTelefone(scanner.nextLine());
        System.out.println("Endereço: ");
        administrador1.setEndereco(scanner.nextLine());
        System.out.println("Código do Setor: ");
        administrador1.setCodigoSetor(scanner.nextInt());
        System.out.println("Salário Base: ");
        administrador1.setSalarioBase(scanner.nextFloat());
        System.out.println("Ajuda de custo: ");
        administrador1.setAjudaDeCusto(scanner.nextFloat());

        administrador1.calculaSalario();

        System.out.println(administrador1.toString());

    }
}
