public class AtletaFutebolVolei implements JogadorFutebol, JogadorVolei{
    @Override
    public void baterPenalti() {
        System.out.println("Atleta que joga futebol e volei bateu um pênalti");
    }

    @Override
    public void cobrarEscanteio() {
        System.out.println("Atleta que joga futebol e volei cobrou um escanteio");
    }

    @Override
    public void sacar() {
        System.out.println("Atleta que joga futebol e volei sacou");
    }

    @Override
    public void cortar() {
        System.out.println("Atleta que joga futebol e volei cortou");
    }
}
