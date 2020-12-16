import java.nio.channels.Pipe;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(10.0f,15.0f);
        System.out.println(point1);
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        Point point11 = movablePoint;
        point11.setXY(5.0f,10.0f);
        System.out.println(point11);

    }
}
