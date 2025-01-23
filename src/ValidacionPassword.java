import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var valida = false;
        var passwd = "";

        System.out.println("*** Validación de Password ***");

        while (!valida) {
            System.out.print("Introduce una contraseña (al menos 6 caracteres): ");
            passwd = consola.nextLine();
            if (passwd.strip().length() >= 6) {
                valida = true;
            } else {
                System.out.println("ERROR: La contraseña no cumple con los requisitos. Prueba otra vez.");
            }
        }
        System.out.println("Password validada: " +passwd);
    }
}
