import java.util.Scanner;

public class ContagemMulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMulheres = 0;

        // Laço para ler dados de 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);

            // Leitura da idade
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            // Leitura do sexo
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            // Verifica se é mulher entre 20 e 40 anos
            if (sexo == 'F' || sexo == 'f') {
                if (idade >= 20 && idade <= 40) {
                    contadorMulheres++;
                }
            }
        }

        // Exibe a quantidade de mulheres entre 20 e 40 anos
        System.out.println("Quantidade de mulheres entre 20 e 40 anos: " + contadorMulheres);

