package Question2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.model = 2020;
        car1.marka = "Opel Corsa";
        car1.renk = "Siyah";
        car1.motor = 1.2;

        System.out.println( car1.motor + " hacimli " + car1.model + " " + car1.renk + " " + car1.marka);

    }
}
