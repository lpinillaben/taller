
public class Torres {

    public static void main(String[] args) {
        int discos = 4;
        ordenar(discos, "A", "B", "C");
    }

    public static void ordenar(int inicio, String A, String B, String C) {
        if (inicio == 1) {
            System.out.println("Disco 1 de " + A + " a " + C);
        } else {
            ordenar(inicio - 1, A, C, B);
            System.out.println("Disco " + inicio + " de " + A + " a " + C);
            ordenar(inicio - 1, B, A, C);
        }
    }
}
