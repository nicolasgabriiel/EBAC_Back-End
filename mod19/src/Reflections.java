import java.lang.annotation.Annotation;

public class Reflections {

    public static void main(String[] args) {

        //Instanciando o Objeto
        Demo objectDemo = new Demo();
        //Extraindo as propriedades da Classe
        Class classDemo = objectDemo.getClass();
        //Extraindo as propriedades Annotations
        Annotation annotationDemo = classDemo.getAnnotation(Tabela.class);
        //Exibindo no console
        System.out.println(annotationDemo);

    }
}
