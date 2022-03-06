package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "-----Livro-----\n" + " titulo = " + titulo
                + "\n autor = " + autor 
                + "\n totPaginas = " + totPaginas 
                + "\n pagAtual = " + pagAtual 
                + "\n aberto = " + aberto 
                + "\n leitor = " + leitor.getNome() + ", " + leitor.getSexo();
    }
    

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void abrir() {
        if(this.aberto==false) {
            this.setAberto(true);
        }
    }

    public void fechar() {
        if(this.aberto) {
            this.setAberto(false);
        }
    }

    public void folhear(int p) {
        if(p<=this.getTotPaginas()) {
            this.pagAtual=p;
        } else {
            this.pagAtual=0;
        }
    }

    public void avançarPag() {
        if(this.pagAtual<this.totPaginas) {
            this.setPagAtual(this.getPagAtual()+1);
        }
    }

    public void voltarPag() {
        if(this.pagAtual>0) {
            this.setPagAtual(this.getPagAtual()-1);
        }
    }
}
