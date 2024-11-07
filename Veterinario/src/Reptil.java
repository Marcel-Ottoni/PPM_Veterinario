import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Reptil extends Animal {
    private String tipoPele;
    private boolean venenoso;
    private float valor_consulta = 10;
    public Reptil(String nome,
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
                  String tipoPele,
                  boolean venenoso) {
        super(nome, raca, idade, peso, alimentacao, cor, saude,genero ,habitat, licencaIbama, temperamento);

        this.tipoPele = tipoPele;
        this.venenoso = venenoso;
    }
    public String getTipoPele(){
        return tipoPele;
    }
    public boolean getVenenoso(){
        return venenoso;
    }
    @Override
    public String nomeAtendente() {
        String caminhoArquivo = "src/nomes_reptil";

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
        return 7 * valor_consulta;
    }
}
