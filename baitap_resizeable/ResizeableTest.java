package baitap_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(2);
        shape[1] = new Rectangle(2, 4);
        shape[2] = new Circle(2);
        for (Shape a: shape){
            if (a instanceof Circle){
                System.out.println(((Circle) a).getArea());
                ((Circle) a).resize(10);
            }else if (a instanceof Rectangle){
                System.out.println(((Rectangle) a).getArea());
                ((Rectangle) a).resize(10);
            }else
                System.out.println(((Square) a).getArea());
            ((Square) a).resize(10);
        }

    }
}
