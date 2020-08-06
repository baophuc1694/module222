package baitap_huongdoituong_Fan;

public class FanRun {
    public static void main(String[] args) {
        Fan firstFan = new Fan();
        firstFan.setSpeed(Fan.FAST);
        firstFan.setOn(true);
        firstFan.setRadius(10.0);
        firstFan.setColor("yellow");
        System.out.println("Fan 1: " + firstFan);
        Fan secondFan = new Fan();
        secondFan.setSpeed(Fan.FAST);
        secondFan.setRadius(5.0);
        secondFan.setColor("blue");
        System.out.println("Fan 2: " + secondFan);
    }
}
