package badCode.o;

public class RectangleArea implements AreaCalculation {
    private double width;
    private double height;
    public RectangleArea(double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    public double calculateArea() {
        return width*height;
    }
}
