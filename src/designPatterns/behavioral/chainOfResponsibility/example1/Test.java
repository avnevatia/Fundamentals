package designPatterns.behavioral.chainOfResponsibility.example1;

public class Test
{

  public static void main( String[] args )
  {
    MoneyDispenser moneyDispenser = new MoneyDispenser();
    
    moneyDispenser.getMoney( 15150 );
  }

}
