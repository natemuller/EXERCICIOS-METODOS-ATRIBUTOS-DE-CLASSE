import java.util.Scanner;

public class ConversaoDeUnidadesDeTemperatura {

    public static double CelsiusParaFahrenheit (double celsius) {
        return (9 * celsius/5) + 32;
    }

    public static double FahreheintParaCelsius (double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double CelsiusParaKelvin (double celsius) {
        return celsius + 273.15;
    }

    public static double KelvinParaCelsius (double kelvin) {
        return kelvin - 273.15;
    }

    public static double CelsiusParaReaumur (double celsius) {
        return celsius * 4/5; 
    }

    public static double ReaumurParaCelsius (double reaumur) {
        return reaumur * 5/4;
    }

    public static double KelvinParaRankine (double kelvin) {
        return kelvin * 1.8;
    }

    public static double RankineParaKelvin (double rankine) {
        return rankine/1.8;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;
        double reaumur = 0;
        double rankine = 0;

        while (true) {
            System.out.printf("Escolha uma opcao:\n");
            System.out.printf("1 - Celsius para Fahrenheit\n");
            System.out.printf("2 - Fahrenheit para Celsius\n");
            System.out.printf("3 - Celsius para Kelvin\n");
            System.out.printf("4 - Kelvin para Celsius\n");
            System.out.printf("5 - Celsius para Reaumur\n");
            System.out.printf("6 - Reaumur para Celsius\n");
            System.out.printf("7 - Kelvin para Rankine\n");
            System.out.printf("8 - Rankine para Kelvin\n");
            System.out.printf("9 - Nenhuma das opcoes anteriores\n");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.printf("Digite a temperatura em Celsius: ");
                celsius = scanner.nextDouble();
                System.out.printf("A temperatura em Fahrenheit eh: %.2f\n\n", CelsiusParaFahrenheit(celsius));
            }
            else if (escolha == 2) {
                System.out.printf("Digite a temperatura em Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                System.out.printf("A temperatura em Celsius eh: %.2f\n\n", FahreheintParaCelsius(fahrenheit));
            }
            else if (escolha == 3) {
                System.out.printf("Digite a temperatura em Celsius: ");
                celsius = scanner.nextDouble();
                System.out.printf("A temperatura em Kelvin eh: %.2f\n\n", CelsiusParaKelvin(celsius));
            }
            else if (escolha == 4) {
                System.out.printf("Digite a temperatura em Kelvin: ");
                kelvin = scanner.nextDouble();
                System.out.printf("A temperatura em Celsius eh: %.2f\n\n", KelvinParaCelsius(kelvin));
            }
            else if (escolha == 5) {
                System.out.printf("Digite a temperatura em Celsius: ");
                celsius = scanner.nextDouble();
                System.out.printf("A temperatura em Reaumur eh: %.2f\n\n", CelsiusParaReaumur(celsius));
            }
            else if (escolha == 6) {
                System.out.printf("Digite a temperatura em Reaumur: ");
                reaumur = scanner.nextDouble();
                System.out.printf("A temperatura em Celsius eh: %.2f\n\n", ReaumurParaCelsius(reaumur));
            }
            else if (escolha == 7) {
                System.out.printf("Digite a temperatura em Kelvin: ");
                kelvin = scanner.nextDouble();
                System.out.printf("A temperatura em Rankine eh: %.2f\n\n", KelvinParaRankine(kelvin));
            }
            else if (escolha == 8) {
                System.out.printf("Digite a temperatura em Rankine: ");
                rankine = scanner.nextDouble();
                System.out.printf("A temperatura em Kelvin eh: %.2f\n\n", RankineParaKelvin(rankine));
            }
            else if (escolha == 9) {
                System.out.printf("Bye!\n");
                break;
            }
        }
        scanner.close();
    }
}

