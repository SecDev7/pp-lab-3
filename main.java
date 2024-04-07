import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class main {
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle(new Point(6.3, 5.4), 10, "czerwony");
        System.out.println("Środek kolorowego koła: x = " + coloredCircle.getCenter().getX() + ", y = " + coloredCircle.getCenter().getY());
        System.out.println("Promień kolorowego koła: " + coloredCircle.getRadius());
        System.out.println("Obwód kolorowego koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole powierzchni kolorowego koła: " + coloredCircle.getArea());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    }
}
