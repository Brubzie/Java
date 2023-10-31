import java.util.Scanner;

public class positivo_ou_negativo {
    public static void main(String[] args) {
        String resultado = "";

        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicite ao usuário que insira um valor
            System.out.print("Digite um número inteiro: ");

            // Leia o que o usuário digitou e armazene em uma variável
            int numero = scanner.nextInt();

            if (numero >= 0) {
                resultado = "positivo";
            } else {
                resultado = "negativo";
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir um número inteiro.");
        } finally {
            // Fecha o scanner depois de usar
            scanner.close();
        }

        System.out.println("O número é " + resultado);
    }
}