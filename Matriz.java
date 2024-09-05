
package matriz;
import java.util.Scanner;
public class Matriz {

    // Método para ingresar datos en la matriz
    public static void ingresarDatos(int[][][][][][] matriz, Scanner scanner) {
        // Para simplificar, pedimos datos para una matriz 2x2x2x2x2x2
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            for (int n = 0; n < 2; n++) {
                                System.out.print("Ingrese el valor para matriz[" + i + "][" + j + "][" + k + "][" + l + "][" + m + "][" + n + "]: ");
                                matriz[i][j][k][l][m][n] = scanner.nextInt();
                            }
                        }
                    }
                }
            }
        }
    }

    // Método para mostrar los datos de la matriz
    public static void mostrarDatos(int[][][][][][] matriz) {
        // Para simplificar, mostramos datos para una matriz 2x2x2x2x2x2
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            for (int n = 0; n < 2; n++) {
                                System.out.println("matriz[" + i + "][" + j + "][" + k + "][" + l + "][" + m + "][" + n + "] = " + matriz[i][j][k][l][m][n]);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una matriz 2x2x2x2x2x2
        int[][][][][][] matriz = new int[2][2][2][2][2][2];

        // Ingresar datos en la matriz
        ingresarDatos(matriz, scanner);

        // Mostrar datos de la matriz
        mostrarDatos(matriz);

        scanner.close();
    }
}
