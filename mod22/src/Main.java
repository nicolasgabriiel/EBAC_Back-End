import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira nomes e gêneros separados por vírgula (exemplo: nicolas-m,nicole-f): ");
        String input = scanner.nextLine();

        scanner.close();

        List<NomeGenero> lista = processarEntrada(input);

        List<String> masculinos = lista.stream()
                .filter(ng -> ng.genero.equalsIgnoreCase("m"))
                .map(ng -> ng.nome)
                .collect(Collectors.toList());

        List<String> femininos = lista.stream()
                .filter(ng -> ng.genero.equalsIgnoreCase("f"))
                .map(ng -> ng.nome)
                .collect(Collectors.toList());

        System.out.println("Nomes masculinos: " + masculinos);
        System.out.println("Nomes femininos: " + femininos);
    }

    public static List<NomeGenero> processarEntrada(String input) {
        String[] pairs = input.split(",");
        List<NomeGenero> lista = new ArrayList<>();

        for (String pair : pairs) {
            String[] parts = pair.split("-");
            if (parts.length == 2) {
                String nome = parts[0].trim();
                String genero = parts[1].trim();
                lista.add(new NomeGenero(nome, genero));
            }
        }

        return lista;
    }
}
