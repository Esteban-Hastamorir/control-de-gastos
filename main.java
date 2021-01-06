import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("Buen día, este programa tiene como finalidad ayudarte con tus finanzas personales\nDime por favor que tipo de movimiento vas aregistrar\n"
					+ "[1] Ingreso\n[2] Gasto");
			int opcion = input.nextInt();
			if (opcion == 1) {
				
			}
			else if (opcion == 2) {
				
			}
			else {
				System.out.println("Error, ingres un dato valido");
				main(args);
			}

	}

}
