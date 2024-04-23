import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ordenarLista();
        separarPorSexo();
    }
    public static void ordenarLista() {
        System.out.println(" ");
        System.out.println("**** Vamos criar uma lista de nomes e depois organizá-los ****");
        System.out.println(" ");
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula:");
        String resposta = s.nextLine();
        List<String> listaDeNomes = new ArrayList<String>();
        listaDeNomes.addAll(Arrays.asList(resposta.split(",")));
        System.out.println(" ");
        System.out.println("**** Lista NÃO ordenada: ****");
        System.out.println(listaDeNomes);
        System.out.println(" ");
        System.out.println(" ");
        Collections.sort(listaDeNomes);
        System.out.println("**** Lista ordenada: ****");
        System.out.println(listaDeNomes);
    }


    public static void separarPorSexo() {
        Scanner scanner = new Scanner(System.in);

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();
        System.out.println(" ");
        System.out.println("**** Agora vamos criar uma lista de nomes de homens e mulheres e depois organizalos em suas próprias listas ****");
        System.out.println(" ");

        System.out.println("Quantas pessoas deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                homens.add(nome);
            } else if (sexo == 'F') {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite M ou F.");
                i--; // Decrementar o contador para repetir a iteração
            }
        }
        System.out.println(" ");
        System.out.println("*** Lista de homens: ***");
        System.out.println(" ");
        for (String homem : homens) {
            System.out.println(homem);
        }
        System.out.println(" ");
        System.out.println("*** Lista de mulheres: ***");
        System.out.println(" ");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }

        scanner.close();
    }

}
