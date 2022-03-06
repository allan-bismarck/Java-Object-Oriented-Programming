package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p) { //Este é o método construtor.
        this.modelo=m;
        this.cor=c;
        this.setPonta(p); //Somente uma forma diferente de se fazer.
        this.tampar();
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo=m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta=p;
    }
    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    public void tampar() {
        this.tampada=true;
    }
    public void destampar() {
        this.tampada=false;
    }
    
    //Ctrl + i para criar os métodos setters,getters e o construtor de forma fácil pelo NetBeans.
}
