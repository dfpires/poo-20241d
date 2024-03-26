import rh.Assistente;
import rh.Funcionario;
import rh.Gerente;
import rh.Diretor;

public class Main {
    public static void exibeDados(Funcionario camaleao){
        // cameleão é um objeto polimórfico
        System.out.println(camaleao.toString() + "\n Salário final " +
                camaleao.calculaSalario());
    }
    public static void main(String[] args) {
        Funcionario fu1 = new Assistente();
        fu1 = new Gerente();
        fu1 = new Diretor();

       // Funcionario fu2 = new Funcionario();

        Assistente as1 = new Assistente("João", "Franca",
                "123", 3000, 3);
        exibeDados(as1);

        Gerente ge1 = new Gerente("Pedro", "Franca",
                "456", 5000, 1000);
        exibeDados(ge1);

        Diretor di1 = new Diretor("Lucas", "Franca",
                "789", 7000, 1000);
        exibeDados(di1);
    }
}