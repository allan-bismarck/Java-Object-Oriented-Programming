package projetoragnarok;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Aprendiz {
    private int HP;
    private int Forca;
    private int Inteligencia;
    private int Destreza;
    private int Sorte;
    private int Ap;
    private int DefesaFisica;
    private int DefesaMagica;
    private String Nome;
    private Equipamento equipamento;

    public int getForca() {
        return Forca;
    }

    public void setForca(int Forca) {
        this.Forca = Forca;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public void setInteligencia(int Inteligencia) {
        this.Inteligencia = Inteligencia;
    }

    public int getDestreza() {
        return Destreza;
    }

    public void setDestreza(int Destreza) {
        this.Destreza = Destreza;
    }

    public int getSorte() {
        return Sorte;
    }

    public void setSorte(int Sorte) {
        this.Sorte = Sorte;
    }

    public int getDefesaFisica() {
        return DefesaFisica;
    }

    public void setDefesaFisica(int DefesaFisica) {
        this.DefesaFisica = DefesaFisica;
    }

    public int getDefesaMagica() {
        return DefesaMagica;
    }

    public void setDefesaMagica(int DefesaMagica) {
        this.DefesaMagica = DefesaMagica;
    }

    public String getNome() {
        return Nome;
    }
    
    public int getHP() {
        return HP;
    }

    public int getAp() {
        return Ap;
    }

    public void setAp(int Ap) {
        this.Ap = Ap;
    }
    
    public Aprendiz(String Nome) {
        this.Nome = Nome;
        this.HP = 100;
        this.Ap = 100;
    }
    
    public void setarAtributos() {
        Scanner leitor= new Scanner(System.in);
        int op,quantidade;
        do {
            do {
                System.out.println("------------------------------------------------------");
                System.out.println("Quantidade de AP: "+this.Ap+" Pontos");
                System.out.println("Escolha qual atributo deseja incrementar pontos");
                System.out.println("1 - Força\n2 - Inteligência(magia)\n3 - Destreza(precisão)\n4 - Sorte");
                System.out.println("5 - Defesa física\n6 - Defesa mágica\n0 - sair");
                System.out.print("Sua escolha: ");
                op=leitor.nextInt();
                if(op<0||op>6) {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }while(op<0||op>6);
            if(op==0) {
                break;
            }
            do {
                System.out.println("------------------------------------------------------");
                System.out.println("Insira a quantidade que deseja setar(total disponível: "+this.Ap+")");
                System.out.print("Sua escolha: ");
                quantidade=leitor.nextInt();
                if(quantidade<0) {
                    System.out.println("\nValores negativos não são permitidos! Tente novamente.");
                }
                if(quantidade>this.Ap) {
                    System.out.println("\nValor superior à cota disponível! Tente novamente.");
                }
            }while(quantidade<0||quantidade>this.Ap);
            this.Ap-=quantidade;
            switch(op) {
                case 1:
                    this.Forca=quantidade;
                    break;
                case 2:
                    this.Inteligencia=quantidade;
                    break;
                case 3:
                    this.Destreza=quantidade;
                    break;
                case 4:
                    this.Sorte=quantidade;
                    break;
                case 5:
                    this.DefesaFisica=quantidade;
                    break;
                case 6:
                    this.DefesaMagica=quantidade;
                    break;
            }
        }while(this.Ap>0);
    }
    
    public Aprendiz EvoluirClasse() {
        Aprendiz aux=this;
        Random gerador=new Random();
        ArrayList<String> AttIguais = new ArrayList();
        int sorteio,maior=this.Forca;
        AttIguais.add("Força");
        maior=Math.max(maior,this.Inteligencia);
        maior=Math.max(maior,this.Destreza);
        maior=Math.max(maior,this.Sorte);
        if(maior==this.Inteligencia) {
            AttIguais.add("Inteligencia");
        }
        if(maior==this.Destreza) {
            AttIguais.add("Destreza");
        }
        if(maior==this.Sorte) {
            AttIguais.add("Sorte");
        }
        if(AttIguais.size()>1) {
            sorteio=gerador.nextInt(AttIguais.size());
            //System.out.println(sorteio);
            switch(AttIguais.get(sorteio)) {
                case "Força":
                    aux= new Templario(this.getNome());
                    break;
                case "Inteligencia":
                    aux= new Bruxo(this.getNome());
                    break;
                case "Destreza":
                    aux= new Caçador(this.getNome());
                break;
                case "Sorte":
                    aux= new Mercenário(this.getNome());
                    break;
            }
        } else {
            if(maior==this.Forca) {
                aux= new Templario(this.getNome());
            }
            if(maior==this.Inteligencia) {
                aux= new Bruxo(this.getNome());
            }
            if(maior==this.Destreza) {
                aux= new Caçador(this.getNome());
            }
            if(maior==this.Sorte) {
                aux= new Mercenário(this.getNome());
            }
        }
        aux.setForca(this.getForca());
        aux.setInteligencia(this.getInteligencia());
        aux.setSorte(this.getSorte());
        aux.setDestreza(this.getDestreza());
        aux.setDefesaFisica(this.getDefesaFisica());
        aux.setDefesaMagica(this.getDefesaMagica());
        aux.setAp(this.getAp());
        return aux;
    }
    
    public void Atacar() {
        
    }
    
    public void Esquivar() {
        
    }
    public void Defender() {
        
    }
    public void ReceberDano() {
        
    }
    public String Informacoes() {
        return "0";
    }
    
}
