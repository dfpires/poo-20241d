public class Carro {
    // Atributos
    public String marca, modelo, cor;
    public int ano;
    public boolean motor; // true - ligado ou false - desligado
    public float velAtual;
    public Carro(String marca, String modelo, int ano, String cor,
                 boolean motor, float velAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    // Métodos
    public void acelerar(float x) {
        if (this.motor){
            this.velAtual = this.velAtual + x;
        }
    }

    public void frear(float x) {
        if (this.motor){
            if (this.velAtual - x >= 0){
                this.velAtual -= x;
            }
        }
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor)
            this.motor = true;
    }
    public void desligar(){
        if (this.motor)
            this.motor = false;
    }
    public void mostra(){
        System.out.println("\n Marca: " + this.marca +
                " Modelo " + this.modelo + " Ano " + this.ano +
                " Cor " + this.cor + " Motor " + this.motor +
                " Velocidade atual " + this.velAtual);
    }
}
