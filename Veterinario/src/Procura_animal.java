import javax.swing.*;
import java.awt.*;

public class Procura_animal{
    private JLabel nome;
    private JLabel raca;
    private JLabel idade;
    private JLabel peso;
    private JLabel alimentacao;
    private JLabel cor;
    private JLabel saude;
    private JLabel genero;
    private JLabel habitat;
    private JLabel licenca;
    private JLabel temperamento;
    private JLabel tipo1;
    private JLabel tipo2;
    private JPanel jp;
    private Font fonte;
    private Font fonte2;
    private JLabel titulo;
    private JButton voltar;
    private JLabel veterinario;
    private JLabel valorconsulta;
    public Procura_animal(){
        jp = new JPanel();
        jp.setLayout(null);
        jp.setSize(600,650);
        jp.setBackground(Color.green);
        fonte2 = new Font("Arial", Font.BOLD, 25);
        fonte = new Font("Arial", Font.PLAIN, 25);
        nome = new JLabel();
        nome.setFont(fonte);
        nome.setLocation(150,100);
        nome.setSize(300,85);
        raca = new JLabel();
        raca.setFont(fonte);
        raca.setLocation(150,130);
        raca.setSize(300,85);
        idade = new JLabel();
        idade.setFont(fonte);
        idade.setLocation(150,160);
        idade.setSize(300,85);
        peso = new JLabel();
        peso.setFont(fonte);
        peso.setLocation(150,190);
        peso.setSize(300,85);
        alimentacao = new JLabel();
        alimentacao.setFont(fonte);
        alimentacao.setLocation(150,220);
        alimentacao.setSize(300,85);
        cor = new JLabel();
        cor.setFont(fonte);
        cor.setLocation(150,250);
        cor.setSize(300,85);
        saude = new JLabel();
        saude.setFont(fonte);
        saude.setLocation(150,280);
        saude.setSize(300,85);
        genero = new JLabel();
        genero.setFont(fonte);
        genero.setLocation(150,310);
        genero.setSize(300,85);
        habitat = new JLabel();
        habitat.setFont(fonte);
        habitat.setLocation(150,340);
        habitat.setSize(300,85);
        licenca = new JLabel();
        licenca.setFont(fonte);
        licenca.setLocation(150,370);
        licenca.setSize(300,85);
        temperamento = new JLabel();
        temperamento.setFont(fonte);
        temperamento.setLocation(150,400);
        temperamento.setSize(300,85);
        tipo1 = new JLabel();
        tipo1.setFont(fonte);
        tipo1.setLocation(150,430);
        tipo1.setSize(300,85);
        tipo2 = new JLabel();
        tipo2.setFont(fonte);
        tipo2.setLocation(150,460);
        tipo2.setSize(300,85);
        valorconsulta = new JLabel();
        valorconsulta.setFont(fonte);
        valorconsulta.setLocation(150,490);
        valorconsulta.setSize(300,85);
        veterinario = new JLabel();
        veterinario.setFont(fonte2);
        veterinario.setSize(500,100);
        veterinario.setLocation(150,0);
        titulo = new JLabel("Este é o Animal: ");
        titulo.setFont(fonte2);
        titulo.setSize(500,100);
        titulo.setLocation(150,30);
        voltar = new JButton("Voltar");
        voltar.setSize(100,50);
        voltar.setLocation(450,490);
        jp.add(titulo);
        jp.add(voltar);
        jp.add(nome);
        jp.add(raca);
        jp.add(idade);
        jp.add(peso);
        jp.add(alimentacao);
        jp.add(cor);
        jp.add(saude);
        jp.add(genero);
        jp.add(habitat);
        jp.add(licenca);
        jp.add(temperamento);
        jp.add(tipo1);
        jp.add(tipo2);
        jp.add(veterinario);
        jp.add(valorconsulta);
    }
    public JPanel Getjp(){
        return jp;
    }
    public JLabel getVeterinario(){return veterinario;}
    public JButton getVoltar(){
        return voltar;
    }
    public JLabel getNome_procura(){
        return nome;
    }
    public JLabel getRaca_procura(){return raca;}
    public JLabel getIdade_procura(){return idade;}
    public JLabel getPeso_procura(){return peso;}
    public JLabel getAlimentacao_procura(){return alimentacao;}
    public JLabel getCor_procura(){return cor;}
    public JLabel getSaude_procura(){return saude;}
    public JLabel getGenero_procura(){return genero;}
    public JLabel getHabitat_procura(){return habitat;}
    public JLabel getLicenca_procura(){return licenca;}
    public JLabel getTemperamento_procura(){return temperamento;}
    public JLabel getTipo1(){return tipo1;}
    public JLabel getTipo2(){return tipo2;}
    public JLabel  getValorconsulta(){return valorconsulta;}
}
