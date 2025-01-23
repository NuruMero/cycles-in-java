import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var condicionGanar = false;
        var numeroElegido = 0;
        var intentos = 10;

        var min = 1;
        var max = 50;
        var numeroRespuesta = new Random().nextInt(max);

        System.out.printf("""
                *** Juego de Adivinanzas ***
                Tienes que adivinar un número del 1 al %d.
                Numero seleccionado:\s""", max);
        while (!condicionGanar && intentos>0) {
            System.out.println("Cuentas con "+intentos +" intentos.");
            System.out.print(min);
            for (int i = min; i<max; i++) {
                System.out.print("-");
            }
            System.out.println(max);

            System.out.print("Numero seleccionado: ");
            numeroElegido = consola.nextInt();

            if (numeroElegido <= max && numeroElegido >= min) {
                intentos--;

                if (numeroElegido == numeroRespuesta) {
                    condicionGanar = true;
                    System.out.println("Felicidades, has acertado!");
                } else if (intentos != 0) {
                    if (numeroElegido < numeroRespuesta) {
                        min = numeroElegido;
                        System.out.println("Fallaste! El número es mayor al elegido. Inténtalo otra vez!");
                    } else {
                        max = numeroElegido;
                        System.out.println("Fallaste! El número es menor al elegido. Inténtalo otra vez!");
                    }
                } else {
                    System.out.println("Fallaste! Te quedaste sin intentos! Fin del juego.");
                }

            } else {
                System.out.println("Ese número está fuera de rango. Inténtalo otra vez!");
            }


        }
    }
}
