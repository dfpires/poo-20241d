import exe3.Produto;
import exe3.Radio;
import exe3.Tv;

public class MainProduto {
    public static void main(String args[]){
        Produto prod1;
        prod1 = new Radio(1, 10, 96.5f, "FM");
        System.out.println(prod1.toString());
        prod1.testaUnidade();
        System.out.println(prod1.toString());

        prod1 = new Tv(2, 20, 16);
        System.out.println(prod1.toString());
        prod1.testaUnidade();
        System.out.println(prod1.toString());
    }
}
