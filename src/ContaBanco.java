
import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();
        
        System.out.print("Informe o número de sua conta: ");
        scanner.nextLine(); 
        String numeroConta = scanner.nextLine();
        
        System.out.print("Informe o seu nome completo: ");
        String nome = scanner.nextLine();
        
        System.out.print("Qual o valor para deposito? ");
        double saldo = scanner.nextDouble();
        
        if (numeroAgencia == 219 && numeroConta.equals("214517")) {
            System.out.printf("\nBem-vindo %s! Obrigado(a) por criar uma conta em nosso banco.\n", nome);
            System.out.printf("Sua agência: %d, conta: %s\n", numeroAgencia, numeroConta);
            System.out.printf("Seu saldo de R$ %.2f já está disponível para saque!\n", saldo);
        } else {
            System.out.printf("\nBem-vindo %s, as informações digitadas não conferem. Lamentamos o inconveniente!\n", nome);
        }
        
        scanner.close();
    }
}
