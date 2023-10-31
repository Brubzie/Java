import java.util.Scanner;

public class varBebidas {
    public static void main(String[] args) throws Exception {

        System.out.println("Testando Condicionais.  ");

        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um valor
        System.out.print("Informe sua idade: ");

        // Leia o que o usuário digitou e armazene em uma variável
        int idade = scanner.nextInt();

        System.out.println("Informe quantos acompanhantes ha contigo: ");

        int quantPessoas = scanner.nextInt();

        // Feche o Scanner depois de usar
        scanner.close();

        if (idade >= 18 || (idade == 16 && quantPessoas >= 2)) {
            System.out.println("Voce pode comprar uma bebida.");
        } else {
            System.out.println("Voce nao pode comprar bebida.");
        }

    }
}
