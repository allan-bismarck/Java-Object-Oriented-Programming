package p.pkgfinal;
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    
    public void viuMaisUm() {
        this.totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "----Gafanhoto----\n"+ super.toString() + "\n" + "login = " + login + "\ntotAssistido = " + totAssistido 
                + "\n-----------------";
    }

    @Override
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia()+1);
    }
    
}
