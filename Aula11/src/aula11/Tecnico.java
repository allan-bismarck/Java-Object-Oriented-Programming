package aula11;
public final class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar() {
        System.out.println(this.nome+" começou a trabalhar.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
