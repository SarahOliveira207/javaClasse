package banco;
import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();; //cria uma instancia para a classe
        double valor;
        
        Scanner input = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        
        minhaConta.numero = 1234;
        //minhaConta.nome = "Sarah dos Santos Oliveira";
        minhaConta.limite = 3591.36d;
        minhaConta.setSaldo(2000.00);
        
        System.out.print("Insira o nome do correntista: ");
        String nome = input.nextLine();
        minhaConta.nome = nome;
        System.out.println("\n");
        System.out.println("Correntista: " + minhaConta.nome + "\n" + "Numero da conta: " +  minhaConta.numero);
        System.out.println("\n");
        System.out.print("Coloqe o valor do deposito: ");
        
        valor = inputNumber.nextDouble();
        minhaConta.deposita(valor);
        System.out.println("Saldo atualizado: " + minhaConta.getSaldo());
        
        System.out.print("Insira um valor para sacar: ");
        double saque = inputNumber.nextDouble();
        minhaConta.sacar(saque);
        
    }
    
}
