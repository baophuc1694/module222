package baitap_accsesmodifier;

public class TestCircle {
    public TestCircle(double radius) {
    }
    public TestCircle(double radius, String color){

    }

    public static void main(String[] args) {
        TestCircle[] circles = new TestCircle[2];
        circles[0] = new TestCircle(1.0, "blue");
        circles[1] = new TestCircle(2.0, "red");
        System.out.println("Circle: " + circles);

        }
    }


