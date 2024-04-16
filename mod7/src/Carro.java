public class Carro {

    private String modelo = "Civic";

    private String marca = "Honda";

    private int ano = 2024;

    private int velocidade = 0;


    public String getModelo (){
        return modelo;
    }
    public String getMarca (){
        return marca;
    }
    public int getAno (){
        return ano;
    }
    public int getVelocidade (){
        return velocidade;
    }
    public void setVelocidade(int novaVelocidade) {
        this.velocidade = novaVelocidade;
    }

    public void acelerar( ) {
       velocidade = velocidade + 10;
    }
}