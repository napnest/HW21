package badCode.o;

public class CircleArea implements AreaCalculation {
    private double radius;
    public CircleArea(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
