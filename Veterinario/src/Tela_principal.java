import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_principal extends JFrame implements ActionListener {
    private JPanel jp;
    private JButton botao_cadastrar;
    private JButton botao_procurar;
    private Font fonte;
    private JLabel titulo;
    public Tela_principal(){
        super("veterinario");
        jp =(JPanel) this.getContentPane();
        jp.setLayout(null);
        jp.setBackground(Color.green);
        jp.setSize(600,650);
        fonte = new Font("Arial", Font.BOLD, 50);
        titulo = new JLabel("Veterinario");
        titulo.setFont(fonte);
        titulo.setSize(500,100);
        titulo.setLocation(170,30);
        botao_cadastrar = new JButton("Cadastro");
        botao_cadastrar.setLocation(205,150);
        botao_cadastrar.setSize(200,80);
        botao_procurar = new JButton("Procurar animal");
        botao_procurar.setLocation(205,300);
        botao_procurar.setSize(200,85);
        jp.add(titulo);
        jp.add(botao_cadastrar);
        jp.add(botao_procurar);
    }
    public JPanel Getjp(){
        return jp;
    }
    public JButton Getbotao_cadastrar(){
        return botao_cadastrar;
    }
    public JButton getBotao_procurar(){
        return botao_procurar;
    }
    public void actionPerformed(ActionEvent e) {
        if ("cadastrar".equals(e.getActionCommand())) {

        }
        else if ("procurar".equals(e.getActionCommand())) {

        }
    }
}


