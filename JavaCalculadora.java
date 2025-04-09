import java.util.Scanner;

public class BrCalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        // Solicita o segundo número
        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        // Solicita o operador
        System.out.println("Digite o operador do cálculo (+ , - , * , / ): ");
        char operador = entrada.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    entrada.close();
                    return;
                }
                break;

            default:
                System.out.println("Operação inválida, digite um operador válido!");
                entrada.close();
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);
        entrada.close();
    }
}
