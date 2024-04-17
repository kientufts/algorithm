public class Interval2D{
  private double oUpperLeftX;
  private double oUpperLeftRight;
  private double oWidth;
  private double oHeight;

  public Interval2D(){

  }

  public Interval2D(double aUpperLeftX, double aUpperLeftY, double aHeight, double aWidth){
    oUpperLeftX = aUpperLeftX;
    aUpperLeftY = aUpperLeftY;
    oWidth = aWidth;
    oHeight = aHeight;
  }

  public boolean isEmpty(){
    return oWidth <= 0 || oHeight <= 0;
  }
}
