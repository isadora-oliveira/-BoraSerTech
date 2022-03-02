import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha os dados do veículo:");
        System.out.println("Modelo: ");
        veiculo1.setModelo(scanner.nextLine());
        System.out.println("Marca: ");
        veiculo1.setMarca(scanner.nextLine());
        System.out.println("Cor: ");
        veiculo1.setCor(scanner.nextLine());
        System.out.println("Ano: ");
        veiculo1.setAno(scanner.nextInt());
        System.out.println("Velocidade Máxima: ");
        veiculo1.setVelocidadeMaxima(scanner.nextInt());
        System.out.println("Valor FIPE: ");
        veiculo1.setValorFipe(scanner.nextDouble());

        boolean adcVelocidade= true;

        do{
            System.out.println("Selecione a opção desejada: " +
                    "\n 1 - Adicionar Velocidade " +
                    "\n 2 - Mostrar dados do veículo" +
                    "\n 3 - Reduzir Velocidade" +
                    "\n 4 - Sair");
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe a velocidade do veículo: ");
                    veiculo1.adicionaVelocidade(scanner.nextInt());
                    break;
                case 2:
                    System.out.println(veiculo1.toString());
                    break;
                case 3:
                    veiculo1.frea();
                    break;
                case 4:
                    adcVelocidade = false;
                    break;
                default:
                    System.out.println("Opção Inválida! Selecione uma opção válida!");

            }
        }while (adcVelocidade);
    }
}
