import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame{

    public Animal animal;
    //Seria criada uma classe com a instância que retornaria ela mesmo
    public ArrayList<Animal> animais = new ArrayList<>();
    public Main(){
        super ("Veterinario");
        Tela_principal menu = new Tela_principal();
        Tela_cadastro cadastro = new Tela_cadastro();
        Tela_procura procura = new Tela_procura();
        Procura_animal procurar_animal = new Procura_animal();
        Cadastro_mamifero mamifero = new Cadastro_mamifero();
        Cadastro_anfibio anfibio = new Cadastro_anfibio();
        Cadastro_aves aves = new Cadastro_aves();
        Cadastro_peixes peixes = new Cadastro_peixes();
        Cadastro_reptil reptil = new Cadastro_reptil();

        menu.Getbotao_cadastrar().addActionListener(new MenuAction(cadastro.Getjp()));
        menu.getBotao_procurar().addActionListener(new MenuAction(procura.Getjp()));

        cadastro.getMamifero().addActionListener(new MenuAction(mamifero.getJp()));
        cadastro.getAnfibio().addActionListener(new MenuAction(anfibio.getJp()));
        cadastro.getAves().addActionListener(new MenuAction(aves.getJp()));
        cadastro.getPeixes().addActionListener(new MenuAction(peixes.getJp()));
        cadastro.getReptil().addActionListener(new MenuAction(reptil.getJp()));

        anfibio.getContinuar().addActionListener(new MenuAction(menu.Getjp()));
        aves.getContinuar().addActionListener(new MenuAction(menu.Getjp()));
        mamifero.getContinuar().addActionListener(new MenuAction(menu.Getjp()));
        peixes.getContinuar().addActionListener(new MenuAction(menu.Getjp()));
        reptil.getContinuar().addActionListener(new MenuAction(menu.Getjp()));

        mamifero.getContinuar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //Com o Command seria possível criar um CriarAnimal(mamifero) na nova classe
                    animal = new Mamifero(mamifero.getNome_input(),
                            mamifero.getRaca_input(),
                            mamifero.getIdade_input(),
                            mamifero.getPeso_input(),
                            mamifero.getAlimentacao_input(),
                            mamifero.getCor_input(), mamifero.getSaude_input(),
                            mamifero.getGenero_input(), mamifero.getHabitat_input(), mamifero.getLicenca_input(),
                            mamifero.getTemperamento_input(), mamifero.getPelagem_input(), mamifero.getCastrado_input());
                    animais.add(animal);
                    System.out.println(animal.getNome());
                    System.out.println(animais);
                }catch (NumberFormatException x) {
                    System.out.println("ERRO, CAMPO DE INTEIRO OU DOUBLE COLOCADO ERRADO");
                }
            }
        });
        anfibio.getContinuar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    animal = new Anfibio(anfibio.getNome_input(),
                            anfibio.getRaca_input(),
                            anfibio.getIdade_input(),
                            anfibio.getPeso_input(),
                            anfibio.getAlimentacao_input(),
                            anfibio.getCor_input(), anfibio.getSaude_input(),
                            anfibio.getGenero_input(), anfibio.getHabitat_input(), anfibio.getLicenca_input(),
                            anfibio.getTemperamento_input(), anfibio.getPele_input(), anfibio.getVenenoso_input());
                    //Também teria uma função Add(Animal animal) para o cadastro
                    animais.add(animal);
                    System.out.println(animal.getNome());
                    System.out.println(animais);
                }catch (NumberFormatException x) {
                    System.out.println("ERRO, CAMPO DE INTEIRO OU DOUBLE COLOCADO ERRADO");
                }
                }
        });
        aves.getContinuar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    animal = new Builder().setNome(aves.getNome_input())
                            .setRaca(aves.getRaca_input())
                            .setIdade(aves.getIdade_input())
                            .setPeso(aves.getPeso_input())
                            .setAlimentacao(aves.getAlimentacao_input())
                            .setCor(aves.getCor_input())
                            .setSaude(aves.getSaude_input())
                            .setGenero(aves.getGenero_input())
                            .setHabitat(aves.getHabitat_input())
                            .setLicencaIbama(aves.getLicenca_input())
                            .setTemperamento(aves.getTemperamento_input())
                            .setTipoBico(aves.getBico_input())
                            .setAsaCortada(aves.getAsacortada_input()).build();
                    animais.add(animal);
                    System.out.println(animal.getNome());
                    System.out.println(animais);
                }catch (NumberFormatException x) {
                    System.out.println("ERRO, CAMPO DE INTEIRO OU DOUBLE COLOCADO ERRADO");
                }
            }
        });
        peixes.getContinuar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    animal = new Peixes(peixes.getNome_input(),
                            peixes.getRaca_input(),
                            peixes.getIdade_input(),
                            peixes.getPeso_input(),
                            peixes.getAlimentacao_input(),
                            peixes.getCor_input(), peixes.getSaude_input(),
                            peixes.getGenero_input(), peixes.getHabitat_input(), peixes.getLicenca_input(),
                            peixes.getTemperamento_input(), peixes.getPh_input(), peixes.getLitragem_input());
                    animais.add(animal);
                    System.out.println(animal.getNome());
                    System.out.println(animais);
                }catch (NumberFormatException x) {
                    System.out.println("ERRO, CAMPO DE INTEIRO OU DOUBLE COLOCADO ERRADO");
                }
            }
        });
        reptil.getContinuar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    animal = new Reptil(reptil.getNome_input(),
                            reptil.getRaca_input(),
                            reptil.getIdade_input(),
                            reptil.getPeso_input(),
                            reptil.getAlimentacao_input(),
                            reptil.getCor_input(), reptil.getSaude_input(),
                            reptil.getGenero_input(), reptil.getHabitat_input(), reptil.getLicenca_input(),
                            reptil.getTemperamento_input(), reptil.getPele_input(), reptil.getVenenoso_input());
                    animais.add(animal);
                    System.out.println(animal.getNome());
                    System.out.println(animais);
                }catch (NumberFormatException x) {
                    System.out.println("ERRO, CAMPO DE INTEIRO OU DOUBLE COLOCADO ERRADO");
                }
            }
        });

        procura.getContinuar().addActionListener(new MenuAction(procurar_animal.Getjp()));
        procura.getContinuar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Daria para criar na classe do Singleton um Search(Animal animal) para realizar a busca do animal
                for (int i = 0; i < animais.size(); i++) {
                        if (animais.get(i).getNome().equals(procura.getProcura())) {
                            //Com o Command, poderia criar uma função que recebesse o "procurar animal" e o o animal dentro da lista
                            procurar_animal.getVeterinario().setText(animais.get(i).nomeAtendente());
                            procurar_animal.getNome_procura().setText("Nome: " + animais.get(i).getNome());
                            procurar_animal.getRaca_procura().setText("Raça: " + animais.get(i).getRaca());
                            procurar_animal.getIdade_procura().setText("Idade: " + animais.get(i).getIdade());
                            procurar_animal.getPeso_procura().setText("Peso: " + animais.get(i).getPeso());
                            procurar_animal.getAlimentacao_procura().setText("Alimentação: " + animais.get(i).getAlimentacao());
                            procurar_animal.getCor_procura().setText("Cor: " + animais.get(i).getCor());
                            procurar_animal.getValorconsulta().setText("Valor: " + animais.get(i).ValorTipo());
                            if (animais.get(i).getSaude()) {
                                procurar_animal.getSaude_procura().setText("Saúde: Saudavel");
                            } else {
                                procurar_animal.getSaude_procura().setText("Saúde: Doente");
                            }
                            procurar_animal.getGenero_procura().setText("Genero: " + animais.get(i).getGenero());
                            procurar_animal.getHabitat_procura().setText("Habitat: " + animais.get(i).getHabitat());
                            if (animais.get(i).getLicencaIbama()) {
                                procurar_animal.getLicenca_procura().setText("Licença: Licenciado");
                            } else {
                                procurar_animal.getLicenca_procura().setText("Licença: Não Licenciado");
                            }
                            if (animais.get(i).getTemperamento()) {
                                procurar_animal.getTemperamento_procura().setText("Temperamento: Calmo");
                            } else {
                                procurar_animal.getTemperamento_procura().setText("Temperamento: Bravo");
                            }
                            if(animais.get(i) instanceof Mamifero){
                                procurar_animal.getTipo1().setText("Pelagem: " + ((Mamifero) animais.get(i)).getPelagem());
                                if(((Mamifero) animais.get(i)).getCastrado()){
                                 procurar_animal.getTipo2().setText("Castrado: Sim");
                                }
                                else{
                                    procurar_animal.getTipo2().setText("Castrado: Não");
                                }
                            }
                            else if(animais.get(i) instanceof Anfibio){
                                procurar_animal.getTipo1().setText("Pele: " + ((Anfibio) animais.get(i)).getTipoPele());
                                if(((Anfibio) animais.get(i)).getVenenoso()){
                                    procurar_animal.getTipo2().setText("Venenoso: Sim");
                                }
                                else{
                                    procurar_animal.getTipo2().setText("Venenoso: Não");}
                            }
                            else if(animais.get(i) instanceof Aves){
                                procurar_animal.getTipo1().setText("Bico: " + ((Aves) animais.get(i)).getTipoBico());
                                if(((Aves) animais.get(i)).getAsaCortada()){
                                    procurar_animal.getTipo2().setText("Asa: Cortada");
                                }
                                else{
                                    procurar_animal.getTipo2().setText("Asa: Não Cortada");}
                            }
                            else if(animais.get(i) instanceof Peixes){
                                procurar_animal.getTipo1().setText("Ph: " + ((Peixes) animais.get(i)).getPhAgua());
                                procurar_animal.getTipo2().setText("Litragem: " + ((Peixes) animais.get(i)).getLitragemAnimal());
                            }
                            else if(animais.get(i) instanceof Reptil){
                                procurar_animal.getTipo1().setText("Pele: " + ((Reptil) animais.get(i)).getTipoPele());
                                if(((Reptil) animais.get(i)).getVenenoso()){
                                    procurar_animal.getTipo2().setText("Venenoso: Sim");
                                }
                                else{
                                    procurar_animal.getTipo2().setText("Venenoso: Não");}
                            }
                        }

                }
            }
        });
        procurar_animal.getVoltar().addActionListener(new MenuAction(menu.Getjp()));
        procurar_animal.getVoltar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procurar_animal.getNome_procura().removeAll();
            }
        });
        this.add(menu.Getjp());
    }
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setSize(600,650);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private class MenuAction implements ActionListener {
        private JPanel panel;
        private MenuAction(JPanel pnl) {
            this.panel = pnl;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            changePanel(panel);
        }
    }
    private void changePanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().doLayout();
        update(getGraphics());
    }
}