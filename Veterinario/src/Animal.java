public class Animal {
    private String nome;
    private String raca;
    private int idade;
    private double peso;
    private String alimentacao;
    private String cor;
    private boolean saude;
    private String genero;
    private String habitat;
    private boolean licencaIbama;
    private boolean temperamento;
    public Animal(String nome,
                  String raca,
                  int idade,
                  double peso,
                  String alimentacao,
                  String cor,
                  boolean saude,
                  String genero,
                  String habitat,
                  boolean licencaIbama,
                  boolean temperamento) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.alimentacao = alimentacao;
        this.cor = cor;
        this.saude = saude;
        this.genero = genero;
        this.habitat = habitat;
        this.licencaIbama = licencaIbama;
        this.temperamento = temperamento;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public String getCor() {
        return cor;
    }

    public boolean getSaude() {
        return saude;
    }

    public String getGenero() {
        return genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getIdade() {
        return idade;
    }

    public boolean getLicencaIbama() {
        return licencaIbama;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }

    public boolean getTemperamento() {
        return temperamento;
    }
    public String setAlimentacao() {
        return alimentacao;
    }

    public String setCor() {
        return cor;
    }

    public boolean setSaude() {
        return saude;
    }

    public String setGenero() {
        return genero;
    }

    public String setHabitat() {
        return habitat;
    }

    public int setIdade() {
        return idade;
    }

    public boolean setLicencaIbama() {
        return licencaIbama;
    }

    public String setNome() {
        return nome;
    }

    public String setRaca() {
        return raca;
    }

    public double setPeso() {
        return peso;
    }

    public boolean setTemperamento() {
        return temperamento;
    }

    public String nomeAtendente() {
        return null;
    }

    public float ValorTipo(){
        return 0;
    }

}
