package baitap_kethua_Cirlce;

public class CylinderRun {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1.0, 1.0);
        printCylinderInfo(cylinder);

    }
    public static void printCylinderInfo(Cylinder cylinder){
        System.out.println(cylinder);
        System.out.println("The area: " + cylinder.getHeight());
        System.out.println("The perimeter: " + cylinder.getRadius());
    }
}
