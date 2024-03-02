public class Exercicio2 {

    //a) Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.
    public void produtoInteiros() {
        int produto = 1; // Inicializamos o produto com 1

        // Percorremos os números ímpares de 1 a 15
        for (int i = 1; i <= 15; i += 2) {
            produto *= i; // Multiplicamos o produto pelo número ímpar atual
        }

        System.out.println("O produto dos números ímpares de 1 a 15 é: " + produto);
    }

    // b)

    public void fatorial() {
        for (int n = 1; n <= 20; n++) {
            long fatorial = calcularFatorial(n);
            System.out.println("Fatorial de " + n + " = " + fatorial);
        }
    }
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Não é possível calcular fatorial para números negativos.");
        }

        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
