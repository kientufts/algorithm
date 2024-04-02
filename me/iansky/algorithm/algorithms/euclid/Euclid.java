class Euclid{
  public static void main(String[] args){

    // input validaition
    if(args.length != 2) {
      errorInput();
      return;
    }

    int p = Integer.parseInt(args[0]);
    int q = Integer.parseInt(args[1]);

    if(p < 0 || q <0){
      errorInput();
      return;
    }

    // Eclid algorithm
    System.out.println("The greatest common devider of " + p + " and " + q + " is " + euclid(p,q));
  }

  private static int euclid(int p, int q){
    if(q == 0) return p;
    int r = p % q;
    return euclid(q, r);
  }

  private static void errorInput(){
    System.out.println("This algorithm needs 2 non-negative numbers as input");
  }
}
