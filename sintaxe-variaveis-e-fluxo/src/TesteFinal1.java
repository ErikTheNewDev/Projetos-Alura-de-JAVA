
public class TesteFinal1 {
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			if (multiplicador % multiplicador == 0)
				;
			{
				System.out.print(multiplicador * multiplicador);
				System.out.print(" ");

			}
			System.out.println();
			int fatorial = 1;
			for (int i = 1; i < 11; i++) {
				fatorial *= i;
				System.out.println("Fatorial de " + i + " = " + fatorial);

			}
		}
	}

}
