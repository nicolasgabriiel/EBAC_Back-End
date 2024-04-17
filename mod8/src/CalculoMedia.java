public class CalculoMedia {
    public static void main(String[] args) {
        calcularMedia();
    }

    private static void calcularMedia() {
        int[] notas = {8, 7, 6, 9};
        int somaDasNotas = 0;
        for (int nota : notas) {
            somaDasNotas += nota;
        }
        System.out.println("Valor total das notas: " + somaDasNotas);
        int mediaFinal = somaDasNotas / 4;
        System.out.println("Valor da Média Final: " + mediaFinal);
        if(mediaFinal >= 6){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
}