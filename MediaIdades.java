import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite as idades (digite -1 para sair):");

        while (true) {
            idade = scanner.nextInt();

            if (idade == -1) {
                break;
            }

            soma += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média das idades informadas é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        scanner.close();
    }
}
