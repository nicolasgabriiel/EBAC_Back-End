public class Main {
    public static void main(String[] args) {
        Car sedan = CarFactory.createCar("Sedan");
        if(sedan !=null ){
        sedan.drive();
        }
        Car suv = CarFactory.createCar("SUV");
        if(suv !=null ){
            suv.drive();
        }
    }
}