import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            while True {
            System.out.println("*****************************");
            System.out.println("Qual é a temperatura original?");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");
            System.out.println("******************************");
            System.out.println("Digite a opção (1 a 4) ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

           
            System.out.println("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();

            switch (opcao) {
                case 1 -> {
                    Celsius celsius = new Celsius(temperatura);
                    System.out.println("===Convertendo===");
                    System.out.println("Fahrenheit: " + celsius.converterCpraF());
                    System.out.println("Kelvin: " + celsius.converterCpraK());

                }
                case 2 -> {
                    Fahrenheit fahrenheit = new Fahrenheit(temperatura);
                    System.out.println("===Convertendo===");
                    System.out.println("Celcius: " + fahrenheit.converterFpraC());
                    System.out.println("Kelvin: " + fahrenheit.converterFpraK());

                }
                case 3 -> {
                    Kelvin kelvin = new Kelvin(temperatura);
                    System.out.println("===Convertendo===");
                    System.out.println("Celsius: " + kelvin.converterKpraC());
                    System.out.println("Fahrenheit: " + kelvin.converterKpraF());
                }
               
                case 4 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default-> {
                    System.out.println("Opção inválida.");
                }
                continue;
            }
       
        }} catch (Exception e) {
            System.out.println("Dados incorretos digitados");
        }

    }
}
