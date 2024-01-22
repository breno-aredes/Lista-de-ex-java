import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para o tamanho da sequência de Fibonacci: ");
        int tamanho = scanner.nextInt();

        System.out.println("Sequência de Fibonacci de tamanho " + tamanho + ":");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}