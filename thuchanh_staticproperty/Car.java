package thuchanh_staticproperty;

public class Car {
    private String name;
    private String engine;
    static int numbersOfCars;
    Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numbersOfCars++;
    }
}
