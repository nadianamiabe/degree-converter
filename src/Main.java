import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean proceed = true;

        while (proceed) {
            System.out.println("Deseja fazer qual tipo de conversão?");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Sair");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite uma temperatura em graus Celsius: ");
                    int celsiusDegree = scanner.nextInt();
                    int fahrenheitDegree = (int) (celsiusDegree * 1.8) + 32;
                    System.out.printf("Você converteu %d ºC para %d ºF%n", celsiusDegree, fahrenheitDegree);
                    break;
                case 2:
                    System.out.println("Digite uma temperatura em graus Fahrenheit: ");
                    int fahrenheit = scanner.nextInt();
                    int celsius = (int) ((fahrenheit - 32) / 1.8);
                    System.out.printf("Você converteu %d ºF para %d ºC%n", fahrenheit, celsius);
                    break;
                case 3:
                    proceed = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        System.out.println("Encerrando o programa.");
        scanner.close();
    }
}