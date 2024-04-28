// Main application class that provides a console interface for managing expenses.

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){


        //Variables de código
        int opcion;
        Scanner sc = Scanner(System.in);


        System.out.println("Bienvenido al Sistema de Registro de Gastos Personales ");

        System.out.println("\nPor favor, elige una opción: ");
        System.out.println("1. Agregar un nuevo gasto");
        System.out.println("2. Listar todos los gastos");
        System.out.println("3. Sumarizar gastos por categoría");
        System.out.println("4. Guardar gastos");
        System.out.println("5. Cargar gastos");
        System.out.println("6. Salir");

        System.out.println("Tu opción: ");
        opcion=sc.nextInt();

        switch (opcion) {
            case 1:
                AgregarGasto();
                break;
            case 2:
                ListarGastos();
                break;

            case 3:
                SumarizarGastos();
                break;

            case 4:
                GuardarGastos();
                break;

            case 5:
                CargaraGastos();
                break;

            case 6:
                System.out.println("Cerrando aplicación...");
                break;

                default:
                System.out.println("Elige otra opción, por favor: ");


            
        }


    }

    private static Scanner Scanner(InputStream in) {
        
        throw new UnsupportedOperationException("Unimplemented method 'Scanner'");
    }

    
}
