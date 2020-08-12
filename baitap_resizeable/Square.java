package baitap_resizeable;

public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double length){
        setLength(length);
    }

    @Override
    public String toString() {
        return "Square{}";
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }
}
