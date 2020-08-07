package thuchanh_staticproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numbersOfCars);
        Car car2 = new Car("Huyndai","Skyactiv 4");
        System.out.println(Car.numbersOfCars);
        Car car3 = new Car("Toyota", "Shyactiv 5");
        System.out.println(Car.numbersOfCars);
    }
}
