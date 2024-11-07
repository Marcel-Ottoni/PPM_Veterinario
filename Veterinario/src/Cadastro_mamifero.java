import javax.swing.*;
import java.awt.*;
public class Cadastro_mamifero{
    private String[] opcoes_saude = {"Saudavel", "Doente"};
    private String[] opcoes_licenca = {"Sim", "Não"};
    private String[] opcoes_temperamento = {"Calmo", "Bravo"};
    private JButton continuar;
    private Font fonte;
    private JPanel jp;
    private JLabel nome;
    private JTextField nome_input;
    private JLabel raca;
    private JTextField raca_input;
    private JLabel idade;
    private JTextField idade_input;
    private JLabel peso;
    private JTextField peso_input;
    private JLabel alimentacao;
    private JTextField alimentacao_input;
    private JLabel cor;
    private JTextField cor_input;
    private JLabel saude;
    private JComboBox saude_input;
    private JLabel genero;
    private JTextField genero_input;
    private JLabel habitat;
    private JTextField habitat_input;
    private JLabel licencaIbama;
    private JComboBox licencaIbama_input;
    private final JLabel temperamento;
    private final JComboBox temperamento_input;
    private JLabel pelagem;
    private JTextField pelagem_input;
    private JLabel castrado;
    private JComboBox castrado_input;

    public Cadastro_mamifero() {
        jp = new JPanel();
        jp.setLayout(null);
        jp.setSize(600, 650);
        jp.setBackground(Color.green);
        fonte = new Font("Arial", Font.BOLD, 12);
        nome = new JLabel("Nome:");
        raca = new JLabel("Raça:");
        idade = new JLabel("Idade:");
        peso = new JLabel("Peso:");
        alimentacao = new JLabel("Alimentação:");
        cor = new JLabel("Cor:");
        saude = new JLabel("Saude:");
        genero = new JLabel("Gênero:");
        habitat = new JLabel("Habitat:");
        licencaIbama = new JLabel("Licensa:");
        temperamento = new JLabel("Temperamento: ");
        pelagem = new JLabel("Pelagem");
        castrado = new JLabel("Castrado: ");
        continuar = new JButton("Continuar");
        nome_input = new JTextField();
        raca_input = new JTextField();
        idade_input = new JTextField();
        peso_input = new JTextField();
        alimentacao_input = new JTextField();
        cor_input = new JTextField();
        saude_input = new JComboBox(opcoes_saude);
        genero_input = new JTextField();
        habitat_input = new JTextField();
        licencaIbama_input = new JComboBox(opcoes_licenca);
        temperamento_input = new JComboBox(opcoes_temperamento);
        pelagem_input = new JTextField();
        castrado_input = new JComboBox(opcoes_licenca);

        nome.setFont(fonte);
        raca.setFont(fonte);
        idade.setFont(fonte);
        peso.setFont(fonte);
        alimentacao.setFont(fonte);
        cor.setFont(fonte);
        saude.setFont(fonte);
        genero.setFont(fonte);
        habitat.setFont(fonte);
        licencaIbama.setFont(fonte);
        temperamento.setFont(fonte);
        pelagem.setFont(fonte);
        castrado.setFont(fonte);
        nome.setSize(200, 300);
        nome.setLocation(160, -105);
        raca.setSize(200, 300);
        raca.setLocation(160, -65);
        idade.setSize(200, 300);
        idade.setLocation(160, -25);
        peso.setSize(200, 300);
        peso.setLocation(160, 15);
        alimentacao.setSize(200, 300);
        alimentacao.setLocation(120, 55);
        cor.setSize(200, 300);
        cor.setLocation(170, 95);
        saude.setSize(200, 300);
        saude.setLocation(150, 135);
        genero.setSize(200, 300);
        genero.setLocation(150, 175);
        habitat.setSize(200, 300);
        habitat.setLocation(150, 215);
        licencaIbama.setSize(200, 300);
        licencaIbama.setLocation(145, 255);
        temperamento.setSize(200, 300);
        temperamento.setLocation(105, 295);
        pelagem.setSize(200, 300);
        pelagem.setLocation(140, 335);
        castrado.setSize(200, 300);
        castrado.setLocation(140, 375);
        continuar.setSize(100, 50);
        continuar.setLocation(450, 490);

        nome_input.setSize(150, 30);
        nome_input.setLocation(200, 30);
        raca_input.setSize(150, 30);
        raca_input.setLocation(200, 70);
        idade_input.setSize(150, 30);
        idade_input.setLocation(200, 110);
        peso_input.setSize(150, 30);
        peso_input.setLocation(200, 150);
        alimentacao_input.setSize(150, 30);
        alimentacao_input.setLocation(200, 190);
        cor_input.setSize(150, 30);
        cor_input.setLocation(200, 230);
        saude_input.setSize(150, 30);
        saude_input.setLocation(200, 270);
        genero_input.setSize(150, 30);
        genero_input.setLocation(200, 310);
        habitat_input.setSize(150, 30);
        habitat_input.setLocation(200, 350);
        licencaIbama_input.setSize(150, 30);
        licencaIbama_input.setLocation(200, 390);
        temperamento_input.setSize(150, 30);
        temperamento_input.setLocation(200, 430);
        pelagem_input.setSize(150, 30);
        pelagem_input.setLocation(200, 470);
        castrado_input.setSize(150, 30);
        castrado_input.setLocation(200, 510);

        jp.add(nome);
        jp.add(raca);
        jp.add(idade);
        jp.add(peso);
        jp.add(alimentacao);
        jp.add(cor);
        jp.add(saude);
        jp.add(genero);
        jp.add(habitat);
        jp.add(licencaIbama);
        jp.add(temperamento);
        jp.add(pelagem);
        jp.add(castrado);
        jp.add(nome_input);
        jp.add(raca_input);
        jp.add(idade_input);
        jp.add(peso_input);
        jp.add(alimentacao_input);
        jp.add(cor_input);
        jp.add(saude_input);
        jp.add(genero_input);
        jp.add(habitat_input);
        jp.add(licencaIbama_input);
        jp.add(temperamento_input);
        jp.add(pelagem_input);
        jp.add(castrado_input);
        jp.add(continuar);
    }

    public JPanel getJp() {
        return jp;
    }

    public JButton getContinuar() {
        return continuar;
    }

    public String getNome_input() {
        return nome_input.getText();
    }

    public String getRaca_input() {
        return raca_input.getText();
    }

    public int getIdade_input() {
        return Integer.parseInt(idade_input.getText());
    }

    public double getPeso_input() {
        return Double.parseDouble(peso_input.getText());
    }

    public String getAlimentacao_input() {
        return alimentacao_input.getText();
    }

    public String getCor_input() {
        return cor_input.getText();
    }

    public boolean getSaude_input() {
        if (saude_input.getSelectedItem() == "Saudavel") {
            return true;
        } else {
            return false;
        }
    }

    public String getGenero_input() {
        return genero_input.getText();
    }

    public String getHabitat_input() {
        return habitat_input.getText();
    }

    public boolean getLicenca_input() {
        if (licencaIbama_input.getSelectedItem() == "Sim") {
            return true;
        } else {
            return false;
        }
    }

    public boolean getTemperamento_input() {
        if (temperamento_input.getSelectedItem() == "Calmo") {
            return true;
        } else {
            return false;
        }
    }

    public String getPelagem_input() {
        return pelagem_input.getText();
    }

    public boolean getCastrado_input() {
        if (castrado_input.getSelectedItem() == "Sim") {
            return true;
        } else {
            return false;
        }
    }
}