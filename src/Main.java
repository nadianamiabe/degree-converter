import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja fazer qual tipo de conversão?");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Digite uma temperatura em graus Celsius: ");
            int celsiusDegree = scanner.nextInt();
            int fahrenheitDegree = (int) (celsiusDegree * 1.8) + 32;
            System.out.printf("Você converteu %d Cº para %d Fº%n", celsiusDegree, fahrenheitDegree);
        } else if (option == 2) {
            System.out.println("Digite uma temperatura em graus Fahrenheit: ");
            int fahrenheitDegree = scanner.nextInt();
            int celsiusDegree = (int) ((fahrenheitDegree - 32) / 1.8);
            System.out.printf("Você converteu %d Fº para %d Cº%n", fahrenheitDegree, celsiusDegree);
        } else {
            System.out.println("Opção inválida");
        }
        scanner.close();
    }
}