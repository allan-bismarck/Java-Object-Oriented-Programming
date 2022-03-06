package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria()==l2.getCategoria()&&l1!=l2) {
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        } else {
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    public void lutar() {
        if(this.aprovada) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio=new Random();
            int vencedor=aleatorio.nextInt(3);
            switch(vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Venceu "+desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Venceu "+desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}
