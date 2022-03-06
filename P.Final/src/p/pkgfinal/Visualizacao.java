package p.pkgfinal;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porcentagem) {
        int total;
        if(porcentagem<=20) {
            total=3;
        } else {
            if(porcentagem<=50) {
                total=5;
            } else {
                if(porcentagem<=90) {
                    total=8;
                } else {
                    total=10;
                }
            }
        }
        this.filme.setAvaliacao(total);
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    @Override
    public String toString() {
        return "----Visualizacao----\n" + "espectador = " + espectador + "\nfilme = " + filme + "\n-------------";
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
