import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar o número
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Calcula e exibe a tabuada de 0 a 10
        System.out.println("Tabuada de multiplicação do número " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

