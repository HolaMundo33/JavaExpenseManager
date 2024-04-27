// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.
public class ExpenseManager {
  	static int indicegasto = 0;
    public static double[] gastod = new double[100];
    public static String[] gastotipo = new String[100];
 
	

    //método para añadir gasto
    public static void addGasto(Expense g) {
    	   gastod[indicegasto]= g.getGasto();
    	   gastotipo[indicegasto]=g.getTipogasto();
    	   indicegasto++;
       }
    static void saveDataFromFile(){
        //TODO: add logic to upload file
    }

    static void loadData(){
        //TODO: add logic to load data
    }
  
  
	public static void sumarizarGastos(String tipo) {
    	double sum = 0;
    	for(int i=0; i<indicegasto; i++) {
    		if(gastotipo[i].equals(tipo)){
    			sum = sum + gastod[i];
    		}
    	}
    	System.out.println("Total de gastos en " + tipo + " " + sum + "€");
    }
  
}
