import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        livro1.setNomeLeitor(scanner.nextLine());
        System.out.println("Informe o título do livro: ");
        livro1.setTitulo(scanner.nextLine());
        System.out.println("Qual é o número de páginas total do livro? ");
        livro1.setPaginasTotal(scanner.nextDouble());
        System.out.println("Quantas páginas você já leu?");
        livro1.setPaginasLidas(scanner.nextDouble());

        livro1.porcentagemLeitura();

    }


}
