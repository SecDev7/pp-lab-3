import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[]{
            new Circle(new Point(0, 0), 5),
            new ColoredCircle(new Point(1, 1), 4, "czerwony"),
            new Circle(new Point(2, 2), 6),
            new ColoredCircle(new Point(3, 3), 3, "zielony")
        };

        for (Circle circle : circles) {
            System.out.println("Pole koła: " + circle.getArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }
    }
}
