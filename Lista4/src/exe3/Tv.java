package exe3;
public class Tv extends Produto {
    private int canal;
    public Tv() {
        super();
    }
    public Tv(int serial, int volume, int canal) {
        super(serial, volume);
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Tv{" +
                super.toString() + "canal=" + canal +
                '}';
    }
}
