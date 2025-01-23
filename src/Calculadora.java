import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        double operando1 = 0, operando2 = 0, resultado;
        var salir = false;

        while (!salir) {
            System.out.print("""
                    *** Calculadora en Java ***
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoge una opción:\s""");
            var opcion = consola.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Dame el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.print("Dame el valor 2: ");
                operando2 = consola.nextDouble();
            }

            switch (opcion) {
                case 1 -> {
                    resultado = operando1+operando2;
                    System.out.println("Resultado suma: " +(resultado));
                }
                case 2 -> {
                    resultado = operando1-operando2;
                    System.out.println("Resultado resta: " +(resultado));
                }
                case 3 -> {
                    resultado = operando1*operando2;
                    System.out.println("Resultado multiplicacion: " +(resultado));
                }
                case 4 -> {
                    if (operando1 == 0 || operando2 == 0) {
                        System.out.println("Error: División por cero.");
                    }
                    else {
                        resultado = operando1/operando2;
                        System.out.println("Resultado division: " +(resultado));
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del programa de calculadora. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Selecciona otra opción.\n");
            }
        }
    }
}
