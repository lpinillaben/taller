
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdivinaAnimal {

    public static void main(String[] pps) {
        System.out.println("Juego de adivinar animal domestico");
        System.out.println("Para responder utilice S como si y N como no.");
        ordenar();
    }

    public static void ordenar() {
        Scanner sc = new Scanner(System.in);

        Nodo preg1 = new Nodo("Es un animal mamifero?");
        Nodo preg2 = new Nodo("Vive en la selva");
        Nodo preg3 = new Nodo("tiene Plumas?");
        Nodo preg4 = new Nodo("Tiene caparazon?");
        Nodo preg5 = new Nodo("Vuela?");
        Nodo preg6 = new Nodo("Es Pequeño?");
        Nodo resp1 = new Nodo("Es una Tortuga");
        Nodo resp2 = new Nodo("Es un Perro");
        Nodo resp4 = new Nodo("Es un Pez");
        Nodo resp5 = new Nodo("Es una Gallina");
        Nodo resp6 = new Nodo("Es un Aguila");
        Nodo resp7 = new Nodo("Es un Pajarito");
        Nodo resp8 = new Nodo("Es un león");
        Nodo resp9 = new Nodo("Gracias por jugar !!");

        preg1.setIzquierda(preg2);
        preg1.setDerecha(preg3);
        preg2.setIzquierda(resp8);
        preg2.setDerecha(resp2);
        preg3.setIzquierda(preg5);
        preg3.setDerecha(preg4);
        preg4.setIzquierda(resp1);
        preg4.setDerecha(resp4);
        preg5.setIzquierda(preg6);
        preg5.setDerecha(resp5);
        preg6.setIzquierda(resp7);
        preg6.setDerecha(resp6);

        JOptionPane.showMessageDialog(null, "Piensa en un animal de estos.\n a que te lo adivino? \n perro, leon, Tortuga \n pez, pajaro, aguila, gallina");
//______________________________________________________________________________        
        System.out.println(preg1.getValor());
        String a = sc.nextLine();
        if (a.equals("S")) {
            System.out.println(preg2.getValor());
            String b = sc.nextLine();
            if (b.equals("S")) {
                System.out.println(resp8.getValor());
            } else {
                System.out.println(resp2.getValor());
            }
        } else {
            System.out.println(preg3.getValor());
            String d = sc.nextLine();
            if (d.equals("S")) {
                System.out.println(preg5.getValor());
                String e = sc.nextLine();
                if (e.equals("S")) {
                    System.out.println(preg6.getValor());
                    String f = sc.nextLine();
                    if (f.equals("S")) {
                        System.out.println(resp7.getValor());
                    } else {
                        System.out.println(resp6.getValor());
                    }
                } else {
                    System.out.println(resp5.getValor());
                }
            } else {
                System.out.println(preg4.getValor());
                String g = sc.nextLine();
                if (g.equals("S")) {
                    System.out.println(resp1.getValor());
                }else{
                    System.out.println(resp4.getValor());
                }
            }
        }

    }

}
