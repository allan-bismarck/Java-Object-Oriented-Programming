package aula05.ou.aula06;
public class Aula05OuAula06 {
    public static void main(String[] args) {
        ContaBanco p1=new ContaBanco();
        p1.abrirConta("111","João","cp");
        p1.fecharConta();
        p1.depositar(200.0f);
        p1.sacar(300.0f);
        p1.pagarMensal();
        p1.estadoAtual();
    }
    
}
