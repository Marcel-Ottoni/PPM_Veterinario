import javax.swing.*;
import java.awt.*;

public class Tela_procura extends JFrame{
    private JPanel jp;
    private Font fonte;
    private JButton continuar;
    private JLabel procura;
    private JTextField procura_input;
    public Tela_procura(){
        jp = new JPanel();
        jp.setLayout(null);
        jp.setSize(600,650);
        jp.setBackground(Color.green);

        fonte = new Font("Arial", Font.BOLD, 25);
        procura = new JLabel("Digite o nome do Animal: ");
        procura.setFont(fonte);
        procura.setSize(500,100);
        procura.setLocation(150,30);
        procura_input = new JTextField();
        procura_input.setSize(200,50);
        procura_input.setLocation(200,190);

        continuar = new JButton("Continuar");
        continuar.setSize(100,50);
        continuar.setLocation(450,490);
        jp.add(procura);
        jp.add(procura_input);
        jp.add(continuar);
    }
    public JPanel Getjp(){
        return jp;
    }

    public String getProcura(){
        return procura_input.getText();
    }
    public JButton getContinuar(){
        return continuar;
    }
}
