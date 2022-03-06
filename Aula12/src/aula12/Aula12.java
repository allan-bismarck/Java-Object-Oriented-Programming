package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamífero m=new Mamífero();
        Réptil r=new Réptil();
        Peixe p=new Peixe();
        Ave a=new Ave();
        
        Cachorro k=new Cachorro();
        Canguru c=new Canguru();
        Cobra j=new Cobra();
        Tartaruga t=new Tartaruga();
        GoldFish g=new GoldFish();
        Arara e=new Arara();
        
        c.locomover();
        k.locomover();
        k.emitirSom();
        c.emitirSom();
    }
    
}
