// Análisis (completar)
// Descripción del programa: El programa tiene como finalidad gestionar las puntuaciones de los jugadores en un torneo. Para cada 
// jugador, se registran sus puntajes en cada ronda y al final se deben calcular y mostrar estadísticas.

// Entradas: Cantidad de jugadores(máximo 10), cantidad de rondas (máximo 5), Puntaje de cada uno en cada ronda (num entre 0-100)
// Salidas:Puntaje total del jugador, Promedio total del jugador, Jugador con puntuación más alta 

// Ejemplo: Se indica que jugarán 2 jugadores en 3 rondas, 
//jugador 1 ronda1: 30
//jugador 1 ronda2: 50
//jugador 1 ronda3: 40
//jugador 2 ronda1: 20
//jugador 2 ronda2: 20
//jugador 2 ronda3: 30
//Jugador 1 - Puntaje Total: 120, Promedio: 40
//Jugador 2 - Puntaje Total: 70, Promedio: 23.3

// El jugador con la puntuación más alta es: Jugador 1


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	// Declaración de nuestras constantes a utilizar

	final int CANT_MAX_JUGADORES = 10;
	final int CANT_MAX_RONDAS = 5;


	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{
		// Declaracion de todas las variables a usar en el programa

		int cantJugadores, cantRondas, puntaje;


		// Notificacion al usuario de la solicitud de dato

		System.out.println("Bienvenido al torneo de videouegos");

		System.out.println("Por favor, ingrese la cantidad de jugadores (Máx. 10):");
        cantJugadores = escaner.nextInt();
		

		System.out.println("Ahora, ingrese la cantidad de rondas a jugar (Máx. 5):");
        cantRondas = escaner.nextInt();

       //almacenar puntaje de cada jugador

	   int [] puntajeTotal = new int [cantJugadores]; //aqui voy a guardar los puntos de los jugadores
       double[] promedio = new double[cantJugadores]; // arreglo para almacenar los promedios de cada jugador

	   for (int i = 0; i < cantJugadores; i++){

		   for (int j = 0; j < cantRondas; j++){
             System.out.println("Jugador " + (i+1) + "- Puntaje en ronda" + (j+1) );
			  puntajeTotal[i] += escaner.nextInt(); // suma de una vez los puntajes ingresados de cada ronda por jgador y el resultado se guarda en el arreglo
		   }
	   }


		// Realizamos los cálculos delegandolos a los métodos // Notificación al usuario de los resultados


		for (int i = 0; i < cantJugadores; i++) {
			promedio[i] = calcularPromedio(puntajeTotal[i], cantRondas);
			System.out.println("Jugador " + (i + 1) + " - Puntaje total: " + puntajeTotal[i] + ", Promedio: " + promedio[i]);
		}

		




	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite ... calcular la suma total del puntaje (por ronda) de cada jugador
	 * pero en este caso como sumé de una vez los datos al almacenarlos en el arreglo no usé este método
	 * @param int[] numeros
	 * @return 
	 */

    public int calcularSumaTotal(int[] numeros) {
        // Completar
		return 0;
    }


	/**
	 * Descripción: El método calcularPromedio permite ... calcular el promedio del puntaje por cada jugador
	 * @param int[] puntajeTotal, cantRondas
	 * @return promedio por jugador
	 */

    public double calcularPromedio(int puntajeTotal, int cantRondas) {
        
		return (double)puntajeTotal/cantRondas; 
    }

	/**
	 * Descripción: El método encontrarMayor permite ... identificar cual jugador tuvo la puntuación mas alta
	 * @param double[] numeros
	 * @return 
	 */

    public double encontrarMayor(double[] numeros) {
        // Completar
		return 0;
    }

	

	
}
	

	
