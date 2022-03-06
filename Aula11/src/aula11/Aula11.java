package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Aluno a1=new Aluno();
        a1.setNome("João");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        Bolsista b1=new Bolsista();
        b1.setNome("Ronaldo");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.setMatricula(1112);
        b1.setCurso("Português");
        b1.pagarMensalidade();
    }
    
}
