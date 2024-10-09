import java.util.Scanner;

public class MaiorMenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        Integer maior = null;
        Integer menor = null;

        System.out.println("Digite números inteiros (digite -1 para sair):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            // Atualiza o maior e o menor número
            if (maior == null || numero > maior) {
                maior = numero;
            }
            if (menor == null || numero < menor) {
                menor = numero;
            }
        }

        if (maior != null && menor != null) {
            System.out.println("O maior número informado é: " + maior);
            System.out.println("O menor número informado é: " + menor);
        } else {
            System.out.println("Nenhum número foi informado.");
        }

        scanner.close();
    }
}
