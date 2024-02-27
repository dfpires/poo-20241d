public class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;
    // construtores
    public Aluno() {
    }

    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    // setter
    public void setIdade(int idade){
        // proteger
        if (idade >= 0){
            this.idade = idade;
        }
        else {
            System.out.println("idade inválida");
        }
    }
    public void setP1(float p1){
        if (p1 >= 0 && p1 <= 10){
            this.p1 = p1;
        }
        else {
            System.out.println("p1 inválida");
        }
    }
    public void setP2(float p2){
        if (p2 >= 0 && p2 <= 10){
            this.p2 = p2;
        }
        else {
            System.out.println("p2 inválida");
        }
    }
    public void setNroAluno(int nroAluno){
        // proteger
        if (nroAluno > 0){
            this.nroAluno = nroAluno;
        }
        else {
            System.out.println("Nro inválido");
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getNroAluno(){
        return this.nroAluno;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getP1(){
        return this.p1;
    }
    public float getP2(){
        return this.p2;
    }
    private float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "nroAluno=" + nroAluno +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}

