package designPatterns.behavioral.chainOfResponsibility.example1;


public abstract class Currency
{
  protected Currency nextCurrency = null;
  
  public void setNextCurrency(Currency nextCurrency ) {
    this.nextCurrency = nextCurrency;
  }
  
  abstract int dispense(int amt);
}
