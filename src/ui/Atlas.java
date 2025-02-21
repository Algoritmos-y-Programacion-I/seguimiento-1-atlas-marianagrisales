/*
* Analisis
* Descripcion del programa:Calcular el costo y elaborar las facturas de cada paquete de viaje vendido.
* Entradas:nombre, edad, número de documento de identidad y ciudad.
* Salidas:El costo y la factura de cada paquete de viaje vendido.
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;


	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre, identidad, ciudad;
        int edad;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        // ...
        System.out.println("Bienvenido " + nombre + "!");
        System.out.println("Cuál es tu edad?");
        edad = escaner.nextInt();
        escaner.nextLine();
        System.out.println("Cúal es tu documento de identidad?");
        identidad = escaner.nextLine();
        System.out.println("Cúal es tu ciudad?");
        ciudad = escaner.nextLine();
        
        // ...

        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        double PrecioNoches=150.000;ja
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
    }

	

	
}