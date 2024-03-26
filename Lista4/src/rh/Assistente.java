package rh;
public class Assistente extends Funcionario{
    private float horaExtra;

    public Assistente() {
        super(); // chama o construtor da superclasse
    }

    public Assistente(String nome, String endereco, String cpf,
                      float salario, float horaExtra) {
        // chama construtor com parâmetros da superclasse
        super(nome, endereco, cpf, salario);
        this.setHoraExtra(horaExtra);
    }
    public float getHoraExtra() {
        return horaExtra;
    }
    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }
    @Override // anulação do método herdado da classe pai
    public String toString() {
        return "Assistente{" +
                "horaExtra=" + horaExtra + super.toString() + '}';
    }
    @Override
    public float calculaSalario(){
        return this.salario + (this.horaExtra * 30);
    }
}
