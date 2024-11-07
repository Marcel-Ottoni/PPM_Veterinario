import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Aves extends Animal {
    private boolean asaCortada;
    private String tipoBico;

    private float valor_consulta = 10;

    public Aves(String nome,
                String raca,
                int idade,
                double peso,
                String alimentacao,
                String cor,
                boolean saude,
                String genero,
                String habitat,
                boolean licencaIbama,
                boolean temperamento,
                String tipoBico,
                boolean asaCortada) {

        super(nome, raca, idade, peso, alimentacao, cor, saude,genero ,habitat, licencaIbama, temperamento);


    }
    public boolean getAsaCortada(){
        return asaCortada;
    }
    public String getTipoBico() {
        return tipoBico;
    }


    @Override
    public String nomeAtendente() {
        String caminhoArquivo = "src/nomes_aves";

        File arquivo = new File(caminhoArquivo);

        List<String> linhas = new ArrayList<>();

        try {

            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                linhas.add(linha);
            }
            Random random = new Random();
            int indiceAleatorio = random.nextInt(linhas.size());


            String linhaAleatoria = linhas.get(indiceAleatorio);

            System.out.println("Responsável: Dr. " + linhaAleatoria);
            return "Responsável: Dr. " + linhaAleatoria;

        } catch (FileNotFoundException e) {
            return "Arquivo não encontrado: " + caminhoArquivo;
        }
    }
    @Override
    public float ValorTipo(){
        return 4 * valor_consulta;
    }

    public Animal build(){
        return new Animal(getNome(),getRaca(), getIdade(), getPeso(),getAlimentacao(),getCor(),getSaude(),getGenero(),
                getHabitat(),
                getTemperamento(),
                getLicencaIbama()
                );
    }
}