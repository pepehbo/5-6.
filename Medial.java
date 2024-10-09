import java.util.Scanner;
public class MediaI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidade = 10;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        double media = (double) soma / quantidade;
        System.out.println("A média das idades informadas é: " + media);
        
        scanner.close();
    }
}
