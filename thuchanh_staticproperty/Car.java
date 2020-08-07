package thuchanh_staticproperty;

public class Car {
    private String name;
    private String engine;
    public static int numbersOfCars;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numbersOfCars++;
    }
}
