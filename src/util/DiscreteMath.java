package util;

public class DiscreteMath
{
  private DiscreteMath() {}
  
  public static boolean isPrime(long num) {
    boolean isPrime = true;
    long sqrtN = Calc.sqrt( num );
    
    /**
     * 99999989L is prime number of 8 digit.
     * 
     * This for loop takes square root of n time in worst case where n is prime.
     */
//    for( long i = 2; i < num ; i++ )
    for( long i = 2; i <= sqrtN ; i++ )
    {
      if( num % i == 0 )
      {
        isPrime = false;
//        System.out.println( i + " is factor of " + n );
        break;
      }
    }
//    System.out.println( num + (isPrime ? " is prime." : " is not prime"));
    
    return isPrime;
  }
  
  public static boolean isPerfectSquare( long num) {
    if(num == 1) {
      return true;
    }
    
    boolean isPS = false;
    long square = 1, counter=0;;
    
    for(long i=1; i<=num; i++) {
      counter++;
      square += 2*i+1;
      if(square == num) {
        isPS = true;
      }
      if(num < square) {
        break;
      }
    }
    System.out.println( "Took iteration to complete: " + counter );
    return isPS;
  }
}
