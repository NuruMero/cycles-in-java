public class NumerosParesFor {
    public static void main(String[] args) {
        System.out.println("*** Números Pares utilizando For ***");

        for (var i = 1; i<=20; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
