import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        int resposta;

        do {

            int numero;
            
            System.out.print("Informe um numero: ");
            numero = scan.nextInt();
            
            if (numero <= 0 || numero >= 11) {
                System.out.println("[ERRO] Insira um numero entre 1 e 10.");
                scan.close();
                return;
            }
                    
            System.out.println("Tabuada do " + numero + ':');

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            System.out.print("\nDeseja ver outra tabuada? (1 - sim / 0 - nao)\nOpcao: ");
            resposta = scan.nextInt();

        } while (resposta == 1);

        System.out.println("\nEncerrando...");

        scan.close();

    }
}