package exe2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
        cartoes.add(new DiaDosNamorados("Pedro"));
        cartoes.add(new Natal("Maria"));
        cartoes.add(new Aniversario("José"));

        // percorre o vetor chamando o showMessage()
        for(CartaoWeb item: cartoes){
            item.showMessage(); // aqui ocorre o polimorfismo
        }
    }
}
