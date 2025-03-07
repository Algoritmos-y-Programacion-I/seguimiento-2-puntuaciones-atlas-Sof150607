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
// Jugador 2 - Puntaje Total: 70, Promedio: 23.3

// El jugador con la puntuación más alta es: Jugador 1


package ui; 

import java.util.Scanner; 

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



		




		// Notificacion al usuario de la solicitud de dato

		 System.out.println("Bienvenido al torneo de videouegos");

		 System.out.println("Por favor, ingrese la cantidad de jugadores (Máx. 10):");
         int cantJugadores = escaner.nextInt();

		System.out.println("Ahora, ingrese la cantidad de rondas a jugar (Máx. 5):");
         int cantRondas = escaner.nextInt();


		int[] Jugadores = new int[cantJugadores];
		int[] Puntuaciones = new int[cantRondas][cantJugadores];



		for(int i = 0; i < cantJugadores; i++) {

			for (int j = 0; j < cantRondas; j++) {
            	System.out.println("Jugador " + (i+1) + ", escriba su puntaje de la ronda:" + (j+1) );
            	Puntuaciones[i][j] = escaner.nextInt();
			}
        }

		// for ()

		

		}




		// Realizamos los cálculos delegandolos a los métodos


		// Notificación al usuario de los resultados


	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public int calcularSumaTotal(int[] Puntuaciones) {
       int suma = 0;

	   return 0;
    }

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public double calcularPromedio(int[] numeros) {
        return 0;
    }

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    public double encontrarMayor(double[] numeros) {
        return 0;
    }

	

	
