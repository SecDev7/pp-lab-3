import geometry.point;
import geometry.circle;

public class main {
    public static void main(String[] args) {
        circle circle = new circle(new point(6.3, 5.4), 10);
        System.out.println("srodek koła: x = " + circle.getCenter().getX() + ", y = " + circle.getCenter().getY());
        System.out.println("promień koła: " + circle.getRadius());
        System.out.println("obwód koła: " + circle.calculatePerimeter());
        System.out.println("pole powierzchni kola: " + circle.getArea());
    }
}
