public class NumeroInversos {
    public static void main(String[] args) {
        System.out.println("*** Numeros inversos ***");

        var contador = 10;
        do {
            System.out.print(contador-- + " ");
        } while (contador > 0);
    }
}
