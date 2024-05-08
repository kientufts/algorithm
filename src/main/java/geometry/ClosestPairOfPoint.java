package geometry;
/*
ClosestPoint2D
Input: integer value N
Output: Generates N random points in the unit squares, and the closest pairs

Interal2D
Input: int value N, min, max
Ouput:
- generates N random 2D intervals whose width and height are uniformly distributed between min and max in the unit square.
- draw them and print number of pairs of intervals that intersect, number of intervals that are contained in one another
 */

public class ClosestPairOfPoint {

    private static Point2D[] points;

    public static void main(String[] args) {
        if (!validateUserInput(args)) return;

        int N = Integer.parseInt(args[0]);

        generatePoints(N);

        closetPairs();
    }

    private static boolean validateUserInput(String[] args) {
        if (args == null || args.length != 1) {
            System.out.println("Incorrect number of argument.");
            return false;
        }

        int N = Integer.parseInt(args[0]);
        if (N < 2) {
            System.out.println("Incorrect input, need at least 2 points");
            return false;
        }
        return true;
    }

    private static void generatePoints(int N) {
        points = new Point2D[N];
        System.out.println("Generating " + N + "2D points");
        for (int i = 0; i <= N - 1; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
            System.out.println(points[i]);
        }
    }

    private static void closetPairs() {
        double smallestDistance = 2; // Maximum distance in unit square is sqrt(2)
        int point1 = -1, point2 = -1;
        int N = points.length;
        for (int i = 0; i <= N - 2; i++) {
            for (int j = i + 1; j <= N - 1; j++) {
                double distance = points[i].distanceTo(points[j]);
                if (distance < smallestDistance) {
                    smallestDistance = distance;
                    point1 = i;
                    point2 = j;
                }
            }
        }

        System.out.println("The smallest distance is " + smallestDistance + " between " + points[point1] + " and " + points[point2]);
    }
}
