package banco;

public class Conta {
    public int numero;
    public String nome;
    private double saldo;
    public double limite;
    
    void deposita(double valor){
        /*//usamos o this para referenciar o atributo da classe,
        não uma variável. O que está dentro o método é variável,
        o que está na classe é atributo*/
        
        this.saldo += valor;
    }
    
    boolean sacar(double valor){
        if(this.saldo < valor){
            return false;
        } 
        else{
            this.saldo -=valor;
            return true;
        }
    }  
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
}
