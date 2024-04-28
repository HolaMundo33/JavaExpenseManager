// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseManager {

    int cantidad;
    String concepto;

    ArrayList<Expense> listaGastos = new ArrayList<>();
	
	
	public void AgregarGasto () {
        Scanner scanner = new Scanner(System.in);


        Expense gastoAgregado = new Expense(0,"No hay gasto");
		
		
		System.out.println("Concepto: ");
		
		gastoAgregado.setConcepto(scanner.nextLine());
		
		System.out.println("Cantidad: ");
		
		gastoAgregado.setCantidad(scanner.nextInt()); 
		

		listaGastos.add(gastoAgregado);
		scanner.close();
	}
	
	public void ListarGastos() {

		
	     for (Expense i : listaGastos) {
			System.out.println("Monto: "+i.getCantidad()+" Categoría: "+i.getConcepto());
			
		}
	}
	
	public SumarizarGastos() {
		
	}
	
	public GuardarGastos() {
		
	}
	
	public CargarGastos() {
		
	}

}
