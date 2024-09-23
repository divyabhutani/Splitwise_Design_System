package Models;
public abstract class Split{

  private User owingUser;
  private Double amount;

  public Split(User owingUser){
    super();
    this.owingUser = owingUser;
  }
  public User getOwingUser(){
    return OwingUser;
  }

  public void setOwingUser(User owingUser){
    this.owingUser = owingUser;
  }
  public Double getAmount(){
    return amount;
  }
  public void setAmount(Double amount){
    this.amount = amount;
  }
}