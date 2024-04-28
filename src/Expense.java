// This class represents an individual expense with two attributes: the amount spent and the expense category.
public class Expense {

    int cantidad; //Cantidad de dinero gastado
    String concepto; //Tipo de gasto: comidad, hogar, factura...


    //Constructor de la clase 
    public Expense(int cantidad, String tipo){
        this.concepto=tipo;
        this.cantidad=cantidad;
        
    }


    public void setCantidad(int cantidad){

        this.cantidad=cantidad;
    }
    
    public void setConcepto(String concepto){
        this.concepto=concepto;

    }

    public int getCantidad(){
        return cantidad;
    }

    public String getConcepto(){
        return concepto;
    }

    //Falta crear métodos
}