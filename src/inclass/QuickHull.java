package inclass;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the QuickHull algorithm for finding the convex hull of a list of points. To use, create an instance
 * and then call hull(). Run this class to display an example.
 */
public class QuickHull {

    /** The points for which we are finding the convex hull. */
    private List<Point2D> points;

    /** The points in the convex hull, in clockwise order. */
    private List<Point2D> hull;

    public QuickHull(List<Point2D> points) {
        this.points = new ArrayList<>(points); // Copy for safety
        // TODO You have to complete this. You'll probably want to add at least
        // one more recursive method for the divide-and-conquer algorithm.
    }

    /** Returns a line between two of points, which are at opposite ends of the convex hull of points. */
    Line2D extrema() {
        // Sort points by x coordinates, with ties broken by y
        points.sort(Point2D.Y_ORDER);
        points.sort(Point2D.X_ORDER);
        // Return the first and last points
        return new Line2D(points.get(0), points.get(points.size() - 1));
    }

    /** Returns the set of all the points to the left of line. */
    List<Point2D> leftSet(List<Point2D> points, Line2D line) {
        List<Point2D> result = new ArrayList<>();
        for (Point2D p : points) {
            if (line.isOnLeftSide(p)) {
                result.add(p);
            }
        }
        return result;
    }

    /**
     * Returns the point in lefts (all of which are assumed to be left of line)
     * that is farthest from line.
     */
    public Point2D farthestLeft(List<Point2D> lefts, Line2D line) {
        Point2D result = null;
        double largestArea = -1;
        for (Point2D p : lefts) {
            double area = line.triangleArea(p);
            if (area > largestArea) {
                result = p;
                largestArea = area;
            }
        }
        return result;
    }

    /** Returns the hull computed by the constructor. */
    public List<Point2D> hull() {
        return hull;
    }

    public static void main(String[] args) {
        // Generate and draw points
        StdDraw.setPenRadius(0.01);
        List<Point2D> points = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Point2D p = new Point2D(StdRandom.uniform(), StdRandom.uniform());
            points.add(p);
            StdDraw.point(p.x(), p.y());
        }
        // Find hull
        List<Point2D> hull = new QuickHull(points).hull();
        // Draw hull
        StdDraw.setPenRadius(0.001);
        StdDraw.setPenColor(StdDraw.RED);
        for (int i = 0; i < hull.size(); i++) {
            Point2D p = hull.get(i);
            Point2D q = hull.get((i + 1) % hull.size());
            StdDraw.line(p.x(), p.y(), q.x(), q.y());
        }
    }
}
