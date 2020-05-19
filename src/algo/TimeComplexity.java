package algo;

import util.DiscreteMath;

public class TimeComplexity
{

  public static void main( String[] args )
  {
    long startTime,endTime,timeElapsed;
    long input = 100000000;

    startTime = System.currentTimeMillis();
    for(int i=1; i<=input; i++) {
      if(DiscreteMath.isPrime(i)) {
        System.out.println( i );
      }
    }
    endTime = System.currentTimeMillis();
    timeElapsed = endTime - startTime;
    System.out.println("Execution time in milliseconds: " + timeElapsed);

  }
  
}
