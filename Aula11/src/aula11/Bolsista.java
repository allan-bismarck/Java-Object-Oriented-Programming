package aula11;
public final class Bolsista extends Aluno {
    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de "+this.nome+"!");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.print("O aluno "+this.nome+" é bolsista, pagamento facilitado!\n");
    }
}
