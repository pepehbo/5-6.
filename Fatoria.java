import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro não negativo: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Número inválido. O fatorial não está definido para números negativos.");
        } else {
            long fatorial = 1;
            
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
        
        scanner.close();
    }
}

