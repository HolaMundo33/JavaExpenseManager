// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.
public ExpenseManager() {
    this.expenses = new ArrayList<>();
    this.scanner = new Scanner(System.in);
}

public void addExpense() {
    double amount = getValidAmount();
    String category = getValidCategory();
    Expense expense = new Expense(amount, category);
    expenses.add(expense);
    System.out.println("Gasto agregado correctamente.");
}

private double getValidAmount() {
    while (true) {
        System.out.println("Ingrese la cantidad del gasto:");
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            if (amount <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            } else {
                return amount;
            }
        } catch (NumberFormatException e) {
            System.out.println("Formato de cantidad no válido. Por favor, ingrese un número.");
        }
    }
}

private String getValidCategory() {
    while (true) {
        System.out.println("Ingrese la categoría del gasto:");
        String category = scanner.nextLine().trim();
        if (category.isEmpty()) {
            System.out.println("La categoría no puede estar vacía.");
        } else {
            return category;
        }
    }
}

public void listExpenses() {
    if (expenses.isEmpty()) {
        System.out.println("No hay gastos registrados.");
        return;
    }

    System.out.println("Lista de gastos:");
    for (Expense expense : expenses) {
        System.out.println("Cantidad: " + expense.getAmount() + ", Categoría: " + expense.getCategory());
    }
}

public static void main(String[] args) {
    ExpenseManager expenseManager = new ExpenseManager();

    while (true) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Agregar gasto");
        System.out.println("2. Listar gastos");
        System.out.println("3. Salir");

        int option = 0;
        try {
            option = Integer.parseInt(expenseManager.scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Opción no válida. Por favor, seleccione un número.");
            continue;
        }

        switch (option) {
            case 1:
                expenseManager.addExpense();
                break;
            case 2:
                expenseManager.listExpenses();
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                System.exit(0);
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }
    }
}
