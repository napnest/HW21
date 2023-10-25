import badCode.o.AreaCalculation;
import badCode.o.CircleArea;
import badCode.o.RectangleArea;
import badCode.l.*;
public class Main {
    public static void main(String[] args) {
        AreaCalculation rectangle = new RectangleArea(10,10);
        System.out.println(rectangle.calculateArea());
        AreaCalculation circle = new CircleArea(5);
        System.out.println(circle.calculateArea());
        Bird ostrich = new Ostrich();

    }
}