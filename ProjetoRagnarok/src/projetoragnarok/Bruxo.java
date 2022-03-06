package projetoragnarok;
public class Bruxo extends Aprendiz {

    public Bruxo(String Nome) {
        super(Nome);
    }

    @Override
    public void Atacar() {
        
    }

    @Override
    public void Esquivar() {
        
    }

    @Override
    public void Defender() {
        
    }

    @Override
    public void ReceberDano() {
        
    }
    
    @Override
    public String Informacoes() {
        return "------------------------------------------------------"
        +"\nBRUXO\n"+"Nome = "+this.getNome()+"\nHP = "+this.getHP()+"\nForca = "+this.getForca()+
        "\nInteligencia = "+this.getInteligencia()+"\nDestreza = "+this.getDestreza()+
        "\nSorte = "+this.getSorte()+"\nAp = "+this.getAp()+"\nDefesaFisica = "+this.getDefesaFisica()+
        "\nDefesaMagica = "+this.getDefesaMagica()+
        "\n------------------------------------------------------";
    }

}
