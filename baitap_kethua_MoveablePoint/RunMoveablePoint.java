package baitap_kethua_MoveablePoint;

public class RunMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint  point= new MoveablePoint(1, 1, 2, 2);
        float x = point.getX();
        for (int i = 0; i < 3; i++){
            System.out.println(point);
            point.move();
        }
    }
}
