public class Interval2D{
  private double oUpperLeftX;
  private double oUpperLeftRight;
  private double oWidth;
  private double oHeight;

  public Inverval2D(){

  }

  public Interval2D(double aUpperLeftX, double aUpperLeftY, double aWidth, double aWeight){
    oUpperLeftX = aUpperLeftX;
    aUpperLeftY = aUpperLeftY;
    oWidth = aWidth;
    oHeight = aHeight;
  }

  public boolean isEmpty(){
    return oWidth <= 0 || oHeight <= 0;
  }
}
