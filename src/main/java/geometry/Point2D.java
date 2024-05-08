package geometry;

import java.lang.Math;

public class Point2D {
  private double start;
  private double end;

  public Point2D(double a, double b){
    start = a;
    end = b;
  }

  public double distanceTo(Point2D that){
    return Math.sqrt(Math.pow(start - that.getStartPoint(),2) + Math.pow(end - that.getEndPoint(),2));
  }

  public double getStartPoint(){
    return start;
  }

  public double getEndPoint(){
    return end;
  }

  public String toString(){
    return "Point2D x: " + start + " y: " + end;
  }
}
