// This class represents an individual expense with two attributes: the amount spent and the expense category.
public class Expense {
    //variables miembro
    private static double gasto;
    private static String tipogasto;

    //constructores 
    public Expense(double gasto, String tipogasto) throws Invalid1, Invalid2{
    	if(gasto<=0) {
    		throw new Invalid1();
    	}
    	else if (tipogasto.equals("")){
    		throw new Invalid2();
    	}
    	else {
        this.gasto=gasto;
        this.tipogasto=tipogasto;
    	}
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

class Invalid1 extends Exception{
	public Invalid1(){
		super("El valor del gasto no puede ser negativo");
		}
}

class Invalid2 extends Exception{
	public Invalid2(){
		super("Debes instroducir un tipo de gasto");
		}
}