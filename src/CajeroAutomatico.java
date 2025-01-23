import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        var dinero = 1000.00;

        while (!salir) {
            System.out.print("""
                    *** Sistema de Cajero Automático ***
                    Operaciones que puedes realizar: 
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");
            var opcion = consola.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Tu saldo actual es: " +dinero+"€\n");
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var aRetirar = consola.nextDouble();
                    if (aRetirar > dinero) {
                        System.out.println("No cuentas con el saldo suficiente. Saldo actual es: "+dinero+"€\n");
                    } else {
                        dinero -= aRetirar;
                        System.out.println("Retirando "+aRetirar+"€, tu nuevo saldo es: "+dinero+"€\n");
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var aDepositar = consola.nextDouble();
                    dinero += aDepositar;
                    System.out.println("Depositando "+aDepositar+"€, tu nuevo saldo es: "+dinero+"€\n");
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Selecciona otra opción.\n");
            }
        }
    }
}
