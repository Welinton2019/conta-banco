
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite sua agência");
        String agencia = scanner.next();

        System.out.println("Agora digite sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        //Agora vamos imprimir os dados digitados pelo usuário.

        System.out.println("Olá " + nome + " " + sobrenome);
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println("Conta " + conta);
        System.out.println("E seu saldo " + saldo + " já está disponível para saque!");


    }
}
