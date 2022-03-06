package projetoragnarok;
public class ProjetoRagnarok {
    public static void main(String[] args) {
        Aprendiz aprendiz = new Aprendiz("ABC");
        aprendiz.setarAtributos();
        System.out.println(aprendiz.Informacoes());
        aprendiz=aprendiz.EvoluirClasse();
        System.out.println(aprendiz.Informacoes());
    }
    
}
