// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.
public class ExpenseManager{
	
	//inicializo 2 arrays para guardar gasto(int) y su tipo (String)
	static int indicegasto = 0;
    public static double[] gastod = new double[100];
    public static String[] gastotipo = new String[100];
 
	

    //método para añadir gasto
    public static void addGasto(Expense g) {
    	   gastod[indicegasto]= g.getGasto();
    	   gastotipo[indicegasto]=g.getTipogasto();
    	   indicegasto++;
       }
    }
