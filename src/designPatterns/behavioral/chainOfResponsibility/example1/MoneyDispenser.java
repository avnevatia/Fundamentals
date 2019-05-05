package designPatterns.behavioral.chainOfResponsibility.example1;

public class MoneyDispenser
{
  private int remainder = 0;
  private Currency[] currencys =
  { new INR2000(), new INR500(), new INR200(), new INR100(), new INR50() };
  private Currency initialCurrency = currencys[0];

  public MoneyDispenser()
  {
    for( int i = 1; i < currencys.length; i++ )
    {
      currencys[i - 1].setNextCurrency( currencys[i] );
    }
  }

  public void getMoney( int amt )
  {
    remainder = initialCurrency.dispense( amt );

    if( remainder != 0 )
    {
      System.out.println( "Entered amount is not correct." );
    }
  }

}
