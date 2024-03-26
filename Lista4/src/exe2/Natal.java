package exe2;
public class Natal extends CartaoWeb{
    public Natal() {
        super();
    }
    public Natal(String destinatario) {
        super(destinatario);
    }
    @Override
    public void showMessage() {
        System.out.println(this.destinatario +
                ", Feliz Natal");
    }
}
