// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseManager {

    int cantidad;
    String concepto;

    ArrayList<Expense> listaGastos = new ArrayList<>();
	
	
	public AgregarGasto () {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Concepto: ");
		
		concepto = scanner.nextLine();
		
		System.out.println("Cantidad: ");
		
		cantidad = scanner.nextInt();
		
		Gasto nuevoGasto = Gasto (concepto, cantidad);
		
	}
	
	public ListarGastos() {
		
	}
	
	public SumarizarGastos() {
		
	}
	
	public GuardarGastos() {
		
	}
	
	public CargarGastos() {
		
	}

}
