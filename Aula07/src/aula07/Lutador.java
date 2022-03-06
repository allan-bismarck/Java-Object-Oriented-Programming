package aula07;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso<52.2) {
            this.categoria="inválido";
        } else {
            if(this.peso<=70.3) {
                this.categoria="leve";
            } else {
                if(this.peso<=83.9) {
                    this.categoria="médio";
                } else {
                    if(this.peso<=120.2) {
                        this.categoria="pesado";
                    } else {
                        this.categoria="inválido";
                    }
                }
            }
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void apresentar() {
        System.out.println("---------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Origem: "+this.nacionalidade);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura);
        System.out.println("Pesando: "+this.peso+"Kg");
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Vitórias: "+this.vitorias);
        System.out.println("Derrotas: "+this.derrotas);
        System.out.println("Empates: "+this.empates);
    }
    
    public void status() {
        System.out.println("Nome "+this.nome);
        System.out.println("É um peso "+this.categoria);
        System.out.println("Vitórias: "+this.vitorias);
        System.out.println("Derrotas: "+this.derrotas);
        System.out.println("Empates: "+this.empates);
    }
    
    public void ganharLuta() {
        setVitorias(getVitorias()+1);
    }
    
    public void perderLuta() {
        setDerrotas(getDerrotas()+1);
    }
    
    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }
}
