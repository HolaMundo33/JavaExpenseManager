// This class represents an individual expense with two attributes: the amount spent and the expense category.
public class Expense {

    int cantidad; // Cantidad de dinero gastado
    String concepto; // Tipo de gasto: comidad, hogar, factura...

    // Constructor de la clase
    public Expense(int cantidad, String concepto) {
        if (concepto.equals(null)) {
            System.err.println("Debes poner un concepto obligatoriamente");
        } else {
            this.concepto = concepto;

        }
        if (cantidad < 0) {
            System.out.println("No se puede meter una cantidad negativa.");
        } else {

            this.cantidad = cantidad;
        }

    }


    //MÉTODOS VARIOS
    public void setCantidad(int cantidad) {

        if (cantidad < 0) {
            System.out.println("No se puede meter una cantidad negativa.");
        } else {

            this.cantidad = cantidad;
        }
    }

    public void setConcepto(String concepto) {

        if (concepto.equals(null)) {
            System.err.println("Debes poner un concepto obligatoriamente");
        } else {
            this.concepto = concepto;

        }

    }

    public int getCantidad() {
        return cantidad;
    }

    public String getConcepto() {
        return concepto;
    }

    // Falta crear métodos
}