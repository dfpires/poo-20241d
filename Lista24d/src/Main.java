//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno obj = new Aluno();
        obj.setIdade(-10); // estamos protegidos
        obj.setP1(-5);
        obj.setIdade(19); // estamos protegidos
        obj.setP1(8.0f);
        obj.setP2(9.0f);
        obj.setNroAluno(123);
        obj.setNome("Fulano");

        System.out.println(obj.toString());
        System.out.println("Nome " + obj.getNome());
      //  obj.notaFinal();
    }
}