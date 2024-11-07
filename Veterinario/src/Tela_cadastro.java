import javax.swing.*;
import java.awt.*;

public class Tela_cadastro{
    private JPanel jp;
    private JButton mamifero;
    private JButton reptil;
    private JButton anfibio;
    private JButton peixes;
    private JButton aves;
    private JLabel cadastro;
    private Font fonte;
    public Tela_cadastro(){
        jp = new JPanel();
        jp.setLayout(null);
        jp.setSize(600,650);
        jp.setBackground(Color.red);
        fonte = new Font("Arial", Font.BOLD, 30);
        cadastro = new JLabel("Cadastro");
        cadastro.setFont(fonte);
        cadastro.setSize(200,100);
        cadastro.setLocation(220,30);
        anfibio = new JButton("Anfibio");
        aves = new JButton("Aves");
        mamifero = new JButton("Mamifero");
        peixes = new JButton("Peixes");
        reptil = new JButton("Reptil");
        anfibio.setSize(100,50);
        aves.setSize(100,50);
        mamifero.setSize(100,50);
        peixes.setSize(100,50);
        reptil.setSize(100,50);
        anfibio.setLocation(240,120);
        aves.setLocation(240,200);
        mamifero.setLocation(240,280);
        peixes.setLocation(240,360);
        reptil.setLocation(240,440);
        jp.add(anfibio);
        jp.add(aves);
        jp.add(peixes);
        jp.add(reptil);
        jp.add(mamifero);
        jp.add(cadastro);
    }
    public JPanel Getjp(){
        return jp;
    }
    public JButton getMamifero(){
        return mamifero;
    }
    public JButton getAnfibio(){
        return anfibio;
    }
    public JButton getAves(){
        return aves;
    }
    public JButton getPeixes(){
        return peixes;
    }
    public JButton getReptil(){
        return reptil;
    }

}
