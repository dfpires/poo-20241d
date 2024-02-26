//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainAluno {
    public static void main(String[] args) {
        Aluno obj = new Aluno(123, "Fulano", 19, 6.5f, 8.0f);

        System.out.println(obj.dadosAluno());

        obj.passou();
    }
}