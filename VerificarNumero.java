import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

      
        if (numero % 2 == 0) {
            System.out.print(numero + " é par e ");
        } else {
            System.out.print(numero + " é ímpar e ");
        }

     
        if (numero > 0) {
            System.out.println("positivo.");
        } else if (numero < 0) {
            System.out.println("negativo.");
        } else {
            System.out.println("zero.");
        }

        scanner.close();
    }
}