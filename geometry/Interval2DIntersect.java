public class Interval2DIntersect {

  private static final double LOWER_BOUND_UNIT_SQUARE = 0.0;
  private static final double UPPER_BOUND_UNIT_SQUARE = 1.0;

  private static Interval2D[] intervals;
  
  public static void main(String[] args){
    if(validateInput(args)) return;

    generateIntervals(args);
  }

  private void generateIntevals(args){
    int numberOfIntervals = args[0];
    double min = Double.parseDouble(args[1]);
    double max = Double.parseDouble(args[2]);

    intervals = new Intervals[N];

    for(int i = 0; i <= numberOfIntervals; i++){
      double upperLeftX = Math.random();
      double upperLeftX = Math.random();
      double height = randomInterval(min, max);
      double width = randomInterval(min, max);
    }
  }


  private double randomInverval(double min, double max){
    return min + (max - min) * Math.random(); 
  }

  private static boolean validateInput(String[] args){

    if(args.length == 1 && args[0].equals("help")){
      help();
      return false;
    }

    if(args.length !=3){
      System.out.println("Incorrect number of inputs. For more, check 'java Interval2DIntersect help'");
      return false;
    }

    double min = Double.parseDouble(args[1]);
    double max = Double.parseDouble(args[2]);
    if (min < LOWER_BOUND_UNIT_SQUARE || max > UPPER_BOUND_UNIT_SQUARE || min > max){
      System.out.println("Incorrect input. Check 'java Interval2DIntersect help");
      return false;
    }

    return true;
  }

  public static void help(){
    System.out.println("---------------------");
    System.out.println("This program takes 3 arguments input. The first argument is the number of intervals to be generated.");
    System.out.println("The second and third arguments are between 0.0 and 1.0 to limit the width and height of generated intervals");
    System.out.println("The thrid argument is not smaller than the second argument");
    System.out.println("---------------------");
  }
}
