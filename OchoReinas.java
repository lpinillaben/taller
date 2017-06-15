
public class OchoReinas {

    public static void main(String args[]) {
        int Reinas = 10;
        int[][] matriz = new int[Reinas][Reinas];
        Completar(0, matriz, Reinas);
        for (int i = 0; i < Reinas; i++) {
            for (int j = 0; j < Reinas; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("R ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }

    }

    static boolean Completar(int fila, int[][] matriz, int N) {
        if (fila >= N) {
            return true;
        }
        for (int posicion = 0; posicion < N; posicion++) {
            if (Validacion(matriz, fila, posicion, N)) {
                matriz[fila][posicion] = 1;
                if (!Completar(fila + 1, matriz, N)) {
                    matriz[fila][posicion] = 0;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean Validacion(int[][] matriz, int x, int y, int N) {
        int i, j;
        for (i = 0; i < x; i++) {
            if (matriz[i][y] == 1) {
                return false;
            }
        }
        i = x - 1;
        j = y - 1;
        while ((i >= 0) && (j >= 0)) {
            if (matriz[i--][j--] == 1) {
                return false;
            }
        }
        i = x - 1;
        j = y + 1;
        while ((i >= 0) && (j < N)) {
            if (matriz[i--][j++] == 1) {
                return false;
            }
        }
        return true;
    }
}
