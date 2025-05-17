package banco;

public class Conta {
    int numero;
    String nome;
    double saldo, limite;
    
    void deposita(double valor){
        /*//usamos o this para referenciar o atributo da classe,
        não uma variável. O que está dentro o método é variável,
        o que está na classe é atributo*/
        
        this.saldo += valor;
    }
         
        
}
