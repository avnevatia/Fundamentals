package designPatterns.behavioral.chainOfResponsibility.example1;

public class INR200 extends Currency
{
  private int noOfCurrency = 0;
  private static final int INR = 200;

  @Override
  public int dispense( int amt )
  {
    noOfCurrency = amt / INR;
    amt = amt % INR;

    if( amt != 0 && nextCurrency != null )
    {
      amt = nextCurrency.dispense( amt );
    }

    if( amt == 0 )
    {
      System.out.println( INR + ": " + noOfCurrency );
    }

    return amt;
  }

}
