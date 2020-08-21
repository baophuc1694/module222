package baitap_accsesmodifier;

import java.util.Arrays;

public class TestCircle {
    private double radius;
    private String color;

    private TestCircle(double radius, String color){
        super();
        this.radius = radius;
        this.color = color;

    }

    public static void main(String[] args) {
        TestCircle[] circles = new TestCircle[2];
        circles[0] = new TestCircle(1.0, "blue");
        circles[1] = new TestCircle(2.0, "red");
        System.out.println("Circle: " + circles);

        }
    }


