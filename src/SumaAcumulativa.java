public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // Iterar los valores
        for (var i = 1; i <= MAXIMO; i++) {
            // Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> " +acumuladorSuma + " + "+i);

            // Realizar la suma acumulativa
            acumuladorSuma += i;

            // Imprimir la suma acumulativa
            System.out.println("Suma parcial acumulada: " +acumuladorSuma +"\n");
        }
        System.out.println("Suma de los primeros "+MAXIMO+" numeros: " +acumuladorSuma);
    }
}
