import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Classe Builder com as variaveis, getters e setters, e a função build da classe Aves
public class Builder{
    private String nome;
    private String raca;
    private int idade;
    private double peso;
    private String alimentacao;
    private String cor;
    private boolean saude;
    private String genero;
    private String habitat;
    private String tipoBico;
    private boolean asaCortada;
    private boolean licencaIbama;
    private boolean temperamento;
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
    public Builder setNome(String nome)
    { this.nome = nome; return this; }
    public Builder setRaca(String raca)
    { this.raca = raca; return this; }
    public Builder setIdade(int idade)
    { this.idade = idade; return this; }
    public Builder setPeso(double peso)
    { this.peso = peso; return this; }
    public Builder setAlimentacao(String alimentacao)
    { this.alimentacao = alimentacao; return this; }
    public Builder setCor(String cor)
    { this.cor = cor; return this; }
    public Builder setSaude(boolean saude)
    { this.saude = saude; return this; }
    public Builder setGenero(String genero)
    { this.genero = genero; return this; }
    public Builder setHabitat(String habitat)
    { this.habitat = habitat; return this; }
    public Builder setLicencaIbama(boolean licencaIbama)
    { this.licencaIbama = licencaIbama; return this; }
    public Builder setTemperamento(boolean temperamento)
    { this.temperamento = temperamento; return this;

    }
    public Builder setAsaCortada(boolean asaCortada)
    {
        this.asaCortada = asaCortada;
        return this;

    }
    public Builder setTipoBico(String tipobico) {
        this.tipoBico = tipobico;
        return this;
    }
    public Aves build() {
        return new Aves(nome, raca, idade, peso, alimentacao, cor, saude, genero, habitat, licencaIbama, temperamento, tipoBico, asaCortada);
    }
}
