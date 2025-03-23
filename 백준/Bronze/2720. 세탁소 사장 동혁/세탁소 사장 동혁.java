import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			int change = Integer.parseInt(br.readLine());

			int quarters = change / quarter;
			change %= quarter;

			int dimes = change / dime;
			change %= dime;

			int nickels = change / nickel;
			change %= nickel;

			int pennys = change / penny;
			change %= penny;

			System.out.println(quarters + " " + dimes + " " + nickels + " " + pennys + " ");
		}
		br.close();
	}
}