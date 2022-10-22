import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int quantidade;
		int opcaoOrigem;
		int opcaoDestino;

		System.out.println();
		System.out.println("***SEJA BEM VINDO AO CONVERSOR DE TEMPERATURA*** \n");

		System.out.print("Digite a quantidade de temperaturas que deseja converter: ");
		quantidade = input.nextInt();

		System.out.println("Selecione a unidade de ORIGEM da temperatura: ");
		System.out.println("(1) Celsius ");
		System.out.println("(2) Fahrenheit ");
		System.out.println("(3) Kelvin ");
		opcaoOrigem = input.nextInt();

		System.out.println("Selecione a unidade a ser transformada: ");
		System.out.println("(1) Celsius ");
		System.out.println("(2) Fahrenheit ");
		System.out.println("(3) Kelvin ");
		opcaoDestino = input.nextInt();

		InputServices inputServices = new InputServices();

		// Celsius -> Celsius
		if (opcaoOrigem == 1 && opcaoDestino == 1) {
			inputServices.celciusToCelcius(opcaoOrigem, opcaoDestino, quantidade);

			// Celsius -> Fahrenheit
		} else if (opcaoOrigem == 1 && opcaoDestino == 2) {
			inputServices.celciusToFahrenheit(opcaoOrigem, opcaoDestino, quantidade);

			// Celsius -> Kelvin
		} else if (opcaoOrigem == 1 && opcaoDestino == 3) {
			inputServices.celciusToKelvin(opcaoOrigem, opcaoDestino, quantidade);

			//// Fahrenheit -> Celsius
		} else if (opcaoOrigem == 2 && opcaoDestino == 1) {
			inputServices.fahrenheitToCelsius(opcaoOrigem, opcaoDestino, quantidade);

			//// Fahrenheit -> Fahrenheit
		} else if (opcaoOrigem == 2 && opcaoDestino == 2) {
			inputServices.fahrenheitToFahrenheit(opcaoOrigem, opcaoDestino, quantidade);

			//// Fahrenheit -> Kelvin
		} else if (opcaoOrigem == 2 && opcaoDestino == 3) {
			inputServices.fahrenheitToKelvin(opcaoOrigem, opcaoDestino, quantidade);

			// Kelvin -> Celsius
		} else if (opcaoOrigem == 3 && opcaoDestino == 1) {
			inputServices.kelvinToCelsius(opcaoOrigem, opcaoDestino, quantidade);

			// Kelvin -> Fahrenheit
		} else if (opcaoOrigem == 3 && opcaoDestino == 2) {
			inputServices.kelvinToFahrenheit(opcaoOrigem, opcaoDestino, quantidade);

			// Kelvin -> Kelvin
		} else if (opcaoOrigem == 3 && opcaoDestino == 3) {
			inputServices.kelvinToKelvin(opcaoOrigem, opcaoDestino, quantidade);

			// Caso opções inválidas
		} else if (validaInput(opcaoOrigem, opcaoDestino)) {
			System.out.println("Opção inválida!");
		}

		input.close();
	}

	private static boolean validaInput(int opcaoOrigem, int opcaoDestino) {
		if ((opcaoOrigem != 1) || (opcaoOrigem != 2) || (opcaoOrigem != 3) 
				|| (opcaoDestino != 1) || (opcaoDestino != 2)
				|| (opcaoDestino != 3)) {
			return true;
		}
		return false;

	}
}