package Models;

public abstract class Expense{
  private String id;
  private String payingUser;
  private double amount;
  private List<Split> splits;

  public Expense(String id, User payingUser, double amount, List<Split> splits){
    super();
    this.id = id;
    this.payingUser = payingUser;
    this.amount = amount;
    this.splits = splits;
  }
  public String getId(){
    return id;
  }
  public void setId(String id){
    this.id = id;
  }
  public User getPayingUser(){
    return payingUser;
  }
  public void setPayingUser(User payingUser){
    this.payingUser = payingUser;
  }
  public double getAmount(){
    return amount;
  }

}