package designPatterns.behavioral.template.example1;

public abstract class Worker
{
  public void pay() {
    System.out.println(getAmountDue());
  }
  
  abstract protected String getAmountDue();

}
