import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequence {

    public static List<Integer> generateFibonacciSequence(int n) {
        List<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);

        while (fibSequence.get(fibSequence.size() - 1) < n) {
            int nextFib = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            fibSequence.add(nextFib);
        }

        return fibSequence;
    }

    public static String checkFibonacciNumber(int number) {
        List<Integer> fibSequence = generateFibonacciSequence(number);
        if (fibSequence.contains(number)) {
            return "O número " + number + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + number + " não pertence à sequência de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        String resultado = checkFibonacciNumber(numero);
        System.out.println(resultado);
    }
}