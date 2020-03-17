/**
 * Circle
 */
public class Circle extends TwoDShape {

    public Circle (double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double findArea(){
        double radius, area;
        radius = getWidth() / 2;
        area = Math.PI * radius * radius; 
        return area;
    }

    public double findRadius() {
        double radius;
        radius = getWidth() / 2;
        return radius;
    }

}
