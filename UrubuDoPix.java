import java.util.Scanner;

public class Urubudopix {
    
    public static void main(String[] args){
// referencial para iniciar Scanner:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor para o Urubu: ");
        System.out.println("\n ----------- tabela Urubu: ----------- \n Opção(1): R$200  \n Opção(2): R$500 \n Opção(3): R$1000  ");
        double valorpix = scanner.nextDouble();

        double valordevolta = valorpix * 4;

        System.out.println("O valor de repasse do urubu do pix, é de: " + valordevolta);
        scanner.close();
    }
}
