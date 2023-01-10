import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);
		int num = myInput.nextInt();

		System.out.println("Tabela de multiplicação de " + num);

		for (int i = 1; i < 10; i++) {
			String result = num + " x " + i + " = " + i * num;
			System.out.println(result);
		}
	}
}
