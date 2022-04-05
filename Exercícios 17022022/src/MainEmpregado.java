import java.util.Scanner;

public class MainEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os dados do Empregado:");
        System.out.println("Nome: ");
        empregado1.setNome(scanner.nextLine());
        System.out.println("Telefone: ");
        empregado1.setTelefone(scanner.nextLine());
        System.out.println("Endereço: ");
        empregado1.setEndereco(scanner.nextLine());
        System.out.println("Código Setor: ");
        empregado1.setCodigoSetor(scanner.nextInt());
        System.out.println("Salario Base: ");
        empregado1.setSalarioBase(scanner.nextFloat());


        empregado1.calculaSalario();
        System.out.println(empregado1.toString());

    }
}
