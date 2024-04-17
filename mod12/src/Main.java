import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite nomes separados por vírgula:");
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

}
