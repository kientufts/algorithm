import java.lang.Math;

public class Point2D {
  private double start;
  private double end;

  public Point2D(double a, double b){
    start = a;
    end = b;
  }

  public double length(){
    return Math.abs(a-b);
  }
}
