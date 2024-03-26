package exe3;
public abstract class Produto {
    protected int serial, volume;
    protected String teste;
    public Produto() {
        this.teste = "não testado";
    }
    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
        this.teste = "não testado";
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTeste() {
        return teste;
    }

    public void testaUnidade() {
        if (this.teste.equals("não testado")){
            int aleatorio = (int)(Math.random() * 10); // número entre 0 e 9
            if (aleatorio != 0){
                this.teste = "Aprovado"; // 90%
            }
            else {
                this.teste = "Reprovado"; // 10%
            }
        }
        else {
            System.out.println("Produto já foi testado");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serial=" + serial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}
