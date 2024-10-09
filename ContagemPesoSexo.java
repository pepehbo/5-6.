import java.util.Scanner;

public class ContagemPesoSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int homensPesoAdequado = 0;
        int mulheresPesoAdequado = 0;

        // Laço para ler dados de 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);

            // Leitura do sexo
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            // Leitura do peso
            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();

            // Verifica se é homem com peso entre 60 e 80 kg
            if (sexo == 'M' || sexo == 'm') {
                if (peso >= 60 && peso <= 80) {
                    homensPesoAdequado++;
                }
            }

            // Verifica se é mulher com peso entre 50 e 70 kg
            if (sexo == 'F' || sexo == 'f') {
                if (peso >= 50 && peso <= 70) {
                    mulheresPesoAdequado++;
                }
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de homens com peso entre 60 e 80 kg: " + homensPesoAdequado);
        System.out.println("Quantidade de mulheres com peso entre 50 e 70 kg: " + mulheresPesoAdequado);

        scanner.close();
    }
}

