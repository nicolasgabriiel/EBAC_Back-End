import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Solicitar ao usuário para inserir os nomes e gêneros
        System.out.println("Insira nomes e gêneros separados por vírgula (exemplo: nicolas-m,nicole-f): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] pares = input.split(",");

        // Criar uma lista de objetos NomeGenero
        List<NomeGenero> listaNomeGenero = new ArrayList<>();

        // Criando objetos NomeGenero e adicionando à lista NomeGenero
        for (String par : pares) {
            String[] parts = par.split("-");
            if (parts.length == 2) {
                String nome = parts[0].trim();
                String genero = parts[1].trim();
                listaNomeGenero.add(new NomeGenero(nome, genero));
            }
        }

        // Usar expressões lambda para separar os nomes masculinos e femininos
        List<String> masculinos = listaNomeGenero.stream()
                .filter(ng -> ng.genero.equalsIgnoreCase("m"))
                .map(ng -> ng.nome)
                .collect(Collectors.toList());

        List<String> femininos = listaNomeGenero.stream()
                .filter(ng -> ng.genero.equalsIgnoreCase("f"))
                .map(ng -> ng.nome)
                .collect(Collectors.toList());

        // Imprimir as listas separadas
        System.out.println("Nomes femininos: " + femininos);
        System.out.println("Nomes masculinos: " + masculinos);
    }
}


