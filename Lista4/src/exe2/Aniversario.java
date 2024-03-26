package exe2;
public class Aniversario extends CartaoWeb{
    public Aniversario() {
        super();
    }
    public Aniversario(String destinatario) {
        super(destinatario);
    }
    @Override
    public void showMessage() {
        System.out.println(this.destinatario +
                ", Feliz aniversário");
    }
}
