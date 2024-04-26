// This class represents an individual expense with two attributes: the amount spent and the expense category.
public class Expense {
    //variables miembro
    private static double gasto;
    private static String tipogasto;

    //constructores 
    public Expense(double gasto, String tipogasto) throws Invalid1, Invalid2{
        this.gasto=gasto;
        this.tipogasto=tipogasto;
    }
    
    //metodos publicos
	public static double getGasto() {
		return gasto;
	}

	public static void setGasto(double g) {
		gasto = g;
	}

	public static String getTipogasto() {
		return tipogasto;
	}

	public static void setTipogasto(String tipogasto) {
		tipogasto = tipogasto;
	}
    
}