import java.util.Scanner;

public class Program {

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int previous = 0;
        int current = 1;

        while (current < number) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current == number;
    }

    // Método para contar a ocorrência de 'a' ou 'A' em uma string
    public static int countLetterA(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    // Método para calcular o valor de SOMA conforme o trecho de código dado
    public static int calculateSOMA() {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        return SOMA; // Valor final de SOMA
    }

    // Método para completar a sequência numérica
    public static void completeSequence(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Próximo número na sequência: 9");
                break;
            case 2:
                System.out.println("Próximo número na sequência: 128");
                break;
            case 3:
                System.out.println("Próximo número na sequência: 49");
                break;
            case 4:
                System.out.println("Próximo número na sequência: 100");
                break;
            case 5:
                System.out.println("Próximo número na sequência: 13");
                break;
            case 6:
                System.out.println("Próximo número na sequência: 20");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    // Método para resolver o problema dos interruptores e lâmpadas
    public static void solveSwitchLampProblem() {
        System.out.println("Passos para descobrir qual interruptor controla cada lâmpada:");
        System.out.println("1. Ligue o primeiro interruptor e deixe-o ligado por alguns minutos.");
        System.out.println("2. Desligue o primeiro interruptor.");
        System.out.println("3. Ligue o segundo interruptor e vá imediatamente para a sala das lâmpadas.");
        System.out.println("4. A lâmpada que está acesa corresponde ao segundo interruptor.");
        System.out.println("5. Toque nas outras lâmpadas:");
        System.out.println("   - A lâmpada que está quente mas apagada corresponde ao primeiro interruptor.");
        System.out.println("   - A lâmpada que está fria e apagada corresponde ao terceiro interruptor.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Verificar se um número pertence à sequência de Fibonacci");
        System.out.println("2. Contar a ocorrência da letra 'a' ou 'A' em uma string");
        System.out.println("3. Calcular o valor de SOMA (com INDICE = 12)");
        System.out.println("4. Completar o próximo número na sequência");
        System.out.println("5. Resolver o problema dos interruptores e lâmpadas");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                // Opção 1: Verificar número na sequência de Fibonacci
                System.out.print("Informe um número: ");
                int number = scanner.nextInt();
                if (isFibonacci(number)) {
                    System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
                }
                break;

            case 2:
                // Opção 2: Contar a ocorrência de 'a' ou 'A' em uma string
                System.out.print("Informe uma string: ");
                String input = scanner.nextLine();
                int count = countLetterA(input);
                if (count > 0) {
                    System.out.println("A letra 'a' ou 'A' ocorre " + count + " vezes na string.");
                } else {
                    System.out.println("A letra 'a' ou 'A' não ocorre na string.");
                }
                break;

            case 3:
                // Opção 3: Calcular o valor de SOMA conforme o trecho de código dado
                int soma = calculateSOMA();
                System.out.println("O valor de SOMA ao final do processamento é: " + soma);
                break;

            case 4:
                // Opção 4: Completar o próximo número na sequência
                System.out.println("Escolha uma sequência para completar:");
                System.out.println("1. 1, 3, 5, 7, ___");
                System.out.println("2. 2, 4, 8, 16, 32, 64, ____");
                System.out.println("3. 0, 1, 4, 9, 16, 25, 36, ____");
                System.out.println("4. 4, 16, 36, 64, ____");
                System.out.println("5. 1, 1, 2, 3, 5, 8, ____");
                System.out.println("6. 2, 10, 12, 16, 17, 18, 19, ____");

                int sequenceChoice = scanner.nextInt();
                completeSequence(sequenceChoice);
                break;

            case 5:
                // Opção 5: Resolver o problema dos interruptores e lâmpadas
                solveSwitchLampProblem();
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }

        scanner.close();
    }
}
