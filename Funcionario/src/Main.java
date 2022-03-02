import java.util.Scanner;
/**
 *
 * @author Sunflower98
 */
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os dados do Funcionário");
        System.out.println("Nome: ");
        funcionario1.setNome(scanner.nextLine());
        System.out.println("Sobrenome: ");
        funcionario1.setSobrenome(scanner.nextLine());
        System.out.println("Cidade: ");
        funcionario1.setCidade(scanner.nextLine());
        System.out.println("Estado: ");
        funcionario1.setEstado(scanner.nextLine());
        System.out.println("Horas trabalhadas: ");
        funcionario1.setHorasTrabalhadas(scanner.nextDouble());
        System.out.println("Valor hora: ");
        funcionario1.setValorHora(scanner.nextDouble());


        boolean menu = true;
        do{
            System.out.println("Escolha a opção desejada: "+
                    "\n 1 - Incrementar a quantidade de horas trabalhadas "+
                    "\n 2 - Substituir o valor por hora do funcionário "+
                    "\n 3 - Calcular o salário do funcionário"+
                    "\n 4 - Sair");
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    funcionario1.exibeNomeSobrenome();
                    System.out.println("Informe a quantidade de HE trabalhadas: ");
                    int horasExtras = scanner.nextInt();
                    funcionario1.incrementaHorasTrabalhadas(horasExtras);
                    break;
                case 2:
                    funcionario1.exibeNomeSobrenome();
                    System.out.println("Informe o novo valor hora: ");
                    double novoValorHora = scanner.nextDouble();
                    funcionario1.alteraValorHora(novoValorHora);
                    break;
                case 3:
                    funcionario1.exibeNomeSobrenome();
                    funcionario1.calculaSalario();
                    break;
                case 4:
                    menu = false;
                    break;
                default:
                    System.out.println("Opção Inválida! Selecione uma opção válida!");

            }
        }while(menu);



    }

}


