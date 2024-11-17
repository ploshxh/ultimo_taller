package juego;

import java.util.Random;

public class juego_bomber {

    public static void main(String[] args) {
        // Constantes
        final int FILAS = 10;
        final int COLUMNAS = 10;
        final int NUM_BOMBAS = 5;
        final int NUM_LLAMAS = 4;

        // Crear el tablero arreglo bidimensional
        int[][] tablero = new int[FILAS][COLUMNAS];

        // Colocar bombas y llamas
        colocarAleatorio(tablero, 1, NUM_BOMBAS); // Bombas representadas por 1
        colocarAleatorio(tablero, 2, NUM_LLAMAS); // Llamas representadas por 2

        // Mostrar el tablero
        imprimirTablero(tablero);
    }

    //  colocar objetos aleatoriamente en el tablero
    public static void colocarAleatorio(int[][] tablero, int objeto, int cantidad) {
        Random random = new Random();
        int filas = tablero.length;
        int columnas = tablero[0].length;
        int contador = 0;

        while (contador < cantidad) {
            int fila = random.nextInt(filas); // Generar fila aleatoria
            int columna = random.nextInt(columnas); // Generar columna aleatoria

            // Verificar si la celda está vacía
            if (tablero[fila][columna] == 0) {
                tablero[fila][columna] = objeto;
                contador++;
            }
        }
    }

    //  imprimir el tablero
    public static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
