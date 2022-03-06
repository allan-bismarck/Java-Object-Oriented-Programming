package aula12;
public class Cachorro extends Mamífero {
    public void enterrarOsso() {
        System.out.println("Enterrando um osso");
    }
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
}
