package baitap_huongdoituong_Fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
        this.speed = Fan.SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }
@Override
    public String toString(){
        if (this.isOn()){
            return "speed: " + this.speed
                    + ", color:" + this.color
                    + ", radius:" + this.radius;
        }else {
            return "color: " + this.color
                    + ", radius:" + this.radius;
        }
}


    }

