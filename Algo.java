import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Algo {
    public static void main(String[] args) {
        Algo algo = new Algo();
        algo.run();
    }

    void run() {

    }

    public List<Point> gatherInput(int numPoints) {
        List<Point> input = new ArrayList();
        Random random = new Random();
        random.
        for(int i = 0; i < numPoints; i++) {
//            input.add(new Point(java.util.Random))
        }
        return input;
    }

    public float calculateDistance(Point pointOne, Point pointTwo) {
        return (float) Math.hypot(pointOne.x - pointTwo.x, pointOne.y - pointTwo.y);
    }
}
