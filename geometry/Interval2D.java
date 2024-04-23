public class Interval2D{
  private double oUpperLeftX;
  private double oUpperLeftY;
  private double oWidth;
  private double oHeight;

  public Interval2D(){

  }

  public Interval2D(double aUpperLeftX, double aUpperLeftY, double aWidth, double aHeight){
    oUpperLeftX = aUpperLeftX;
    oUpperLeftY = aUpperLeftY;
    oWidth = aWidth;
    oHeight = aHeight;
  }

  public boolean isEmpty(){
    return oWidth <= 0 || oHeight <= 0;
  }

  public boolean isInsideUnitSquare(){
    if(isEmpty()) return false;
    return oUpperLeftX >= 0 && (oUpperLeftX + oWidth) <= 1 && oUpperLeftY <= 1 && (oUpperLeftY - oHeight) >= 0;
  }

  @Override
  public String toString(){
    return "2D Inverval: Upper Left (X=" + oUpperLeftX + ", Y=" + oUpperLeftY + ", width=" + oWidth + ", height=" + oHeight;
  }
}
