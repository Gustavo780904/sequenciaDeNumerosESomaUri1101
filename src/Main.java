import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = 0, N = 0, ordem = 0;

		do {
			int soma = 0;
			M = sc.nextInt();
			N = sc.nextInt();

			if (M < N) {
				for (int i = 0; ordem < N; i++) {
					
					ordem = M + i;
					soma = soma + M + i;
					System.out.print(ordem + " ");
				}
				if (M > 0 && N > 0) {
				System.out.println("Sum=" + soma);
				}
			}else {
				
				for (int i = 0; ordem < M; i++) {
					
					ordem = N + i;
					soma = soma + N + i;
					System.out.print(ordem + " ");
				}
				if (M > 0 && N > 0) {
					System.out.println("Sum=" + soma);
					}
				
			}

		} while (N > 0 && M > 0);

		sc.close();

	}

}
