public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){

    }
    public Cliente(int nroConta, int nroAgencia, String nome, float saldo){
        this.nroConta = nroConta; this.nroAgencia = nroAgencia;
        this.nome = nome; this.saldo = saldo;
    }
    public void depositar(float x){
        this.saldo += x;
    }
    public void sacar(float x){
        if (this.saldo - x >= 0){
            this.saldo -= x;
        }
    }
    public String mostra(){
       return  " Nro. conta " + this.nroConta + " Nro da agência " +
               this.nroAgencia + " Nome " + this.nome + " Saldo " + this.saldo;
    }
}
