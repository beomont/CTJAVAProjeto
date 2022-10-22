import java.util.Arrays;
import java.util.Scanner;

public class InputServices {

	Scanner input = new Scanner(System.in);
	Conversor convert = new Conversor();

	double media1 = 0.0;
	double media2 = 0.0;	
	

	public void celciusToCelcius(int opOrigem, int opDestino, int quantidade) {

		try {

			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteCelsiusParaCelsius(temperaturas[i]);
				System.out.printf("O valor de C° para C° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);
		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}
	}

	public void celciusToFahrenheit(int opOrigem, int opDestino, int quantidade) {
		try {
			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteCelsiusParaFahrenheit(temperaturas[i]);
				System.out.printf("O valor de C° para F° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);
		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}
	}

	public void celciusToKelvin(int opOrigem, int opDestino, int quantidade) {

		try {
			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteCelsiusParaKelvin(temperaturas[i]);
				System.out.printf("O valor de C° para K° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);
		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}
	}

	public void fahrenheitToCelsius(int opOrigem, int opDestino, int quantidade) {

		try {
			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteFahrenheitParaCelsius(temperaturas[i]);
				System.out.printf("O valor de F° para C° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);

		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}
	}

	public void fahrenheitToFahrenheit(int opOrigem, int opDestino, int quantidade) {

		try {
			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteFahrenheitParaFahrenheit(temperaturas[i]);
				System.out.printf("O valor de F° para F° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);

		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}

	}

	public void fahrenheitToKelvin(int opOrigem, int opDestino, int quantidade) {

		try {
			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteFahrenheitParaKelvin(temperaturas[i]);
				System.out.printf("O valor de F° para K° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);

		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}

	}

	public void kelvinToCelsius(int opOrigem, int opDestino, int quantidade) {

		try {

			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteKelvinParaCelsius(temperaturas[i]);
				System.out.printf("O valor de K° para C° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);

		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}

	}

	public void kelvinToFahrenheit(int opOrigem, int opDestino, int quantidade) {

		try {

			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteKelvinParaFahrenheit(temperaturas[i]);
				System.out.printf("O valor de K° para F° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);

		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}

	}

	public void kelvinToKelvin(int opOrigem, int opDestino, int quantidade) {

		try {

			double[] temperaturas = new double[quantidade];
			double[] listaConvertido = new double[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.print("\nDigite a temperatura #" + (i + 1) + " : ");
				temperaturas[i] = input.nextDouble();
				System.out.println(temperaturas[i]);

				double valor = convert.converteKelvinParaKelvin(temperaturas[i]);
				System.out.printf("O valor de K° para K° é %.2f\n", valor);
				listaConvertido[i] = valor;

				media1 += temperaturas[i] / quantidade;
				media2 += listaConvertido[i] / quantidade;

			}

			System.out.println("\n\nValores escolhidos: " + Arrays.toString(temperaturas));
			System.out.println("Valores transformados: " + Arrays.toString(listaConvertido));
			System.out.printf("Media escolhidos: %.2f%n", media1);
			System.out.printf("Media transformados: %.2f%n", media2);

		} catch (Exception e) {
			System.out.println("Casas decimais deverao ser separadas por virgula");
		}

	}

}
