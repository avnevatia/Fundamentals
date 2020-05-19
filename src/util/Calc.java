package util;

public final class Calc
{
  private Calc() {}
  
  /**
   * This method works on finding out the average number near to square root.
   * It loops till the number is very nearest to the root.
   * This logic works for aproximate square root.
   * @param number
   * @return
   */
  public static long sqrt(long number) {
    if(number == 1) {
      return 1;
    }
    
    long t;
    long counter=0;
   
    //(0+number/2) this will give average of two numbers
    long squareRoot = number / 2;
   
    do {
      t = squareRoot;
      // (number/t) this will give min number for getting average of two numbers
      squareRoot = (t + (number/t)) / 2;
      counter++;
    } while ((t - squareRoot) > 0);
    
    System.out.println( "Took iteration to complete: " + counter );
//    System.out.println( squareRoot );
   
    return squareRoot;
  }
  
  /**
   * This will give 1.75 as square root of 3, instead of, 1.5.
   * @param number
   * @return
   */
  public static double sqrt(double number) {
    if(number == 1) {
      return 1;
    }
    
    double t, t1, t2, t3;
    double counter=0;
   
    double squareRoot = number / 2;
   
    do {
      t = squareRoot;
      t1= (number / t);
      t2 = t + t1;
      squareRoot = t2 / 2;
      t3 = (t - squareRoot);
      counter++;
    } while (t3 > 0);
    
    System.out.println( "Took iteration to complete: " + counter );
//    System.out.println( squareRoot );
   
    return squareRoot;
  }

}
