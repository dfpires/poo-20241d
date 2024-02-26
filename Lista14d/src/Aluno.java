public class Aluno {
    public int nroAluno, idade;
    public String nome;
    public float p1, p2;
    // construtores
    public Aluno(){ // define um objeto sem valor inicial

    }
    public Aluno(int nroAluno, String nome, int idade, float p1, float p2){
        this.nroAluno = nroAluno; this.nome = nome; this.idade = idade; this.p1 = p1; this.p2 = p2;
    }
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String dadosAluno(){
        return "\n Nro " + this.nroAluno + " Nome " + this.nome + " Idade " + this.idade +
                " Nota final " + this.notaFinal();
    }
    public void passou(){
        if (this.notaFinal() >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
