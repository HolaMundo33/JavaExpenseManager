// Main application class that provides a console interface for managing expenses.
public class Main {
	public static void main(String[] args) throws Invalid1, Invalid2 {
	
	 Expense g1 = new Expense(50.21, "Comida");
	 ExpenseManager.addGasto(g1);
	 Expense g2 = new Expense(5.3, "Cofasddas");
	 ExpenseManager.addGasto(g2);
	 Expense g3 = new Expense(21.3, "Cfdf");
	 ExpenseManager.addGasto(g3);
	 Expense g4 = new Expense(37.1, "Comidfdfdf");
	 ExpenseManager.addGasto(g4);
	 Expense g5 = new Expense(1.25, "Comiddfdfdf");
	 ExpenseManager.addGasto(g5);
     }
     
}
