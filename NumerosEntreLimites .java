import java.util.Scanner;

public class NumerosEntreLimites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro positivo: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro positivo: ");
        int num2 = scanner.nextInt();
        
        // Verifica se os números são positivos
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Os números devem ser positivos.");
        } else {
            // Identifica os limites
            int limiteInferior = Math.min(num1, num2);
            int limiteSuperior = Math.max(num1, num2);
            
            System.out.println("Números inteiros entre " + limiteInferior + " e " + limiteSuperior + ":");
            for (int i = limiteInferior + 1; i < limiteSuperior; i++) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
}
}
