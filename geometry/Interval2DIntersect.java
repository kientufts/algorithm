public class Interval2DIntersect {

  private static final double LOWER_BOUND_UNIT_SQUARE = 0.0;
  private static final double UPPER_BOUND_UNIT_SQUARE = 1.0;
  
  public static void main(String[] args){
    if(validateInput(args)) return;
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
    if (min < LOWER_BOUND_UNIT_SQUARE || max > UPPER_BOUND_UNIT_SQUARE){
      System.out.println("Incorrect input. Check 'java Interval2DIntersect help");
      return false;
    }

    return true;
  }

  public static void help(){
    System.out.println("---------------------");
    System.out.println("This program takes 3 arguments input. The first argument is the number of intervals to be generated.");
    System.out.println("The second and third arguments are between 0.0 and 1.0 to limit the width and height of generated intervals");
    System.out.println("---------------------");
  }
}
