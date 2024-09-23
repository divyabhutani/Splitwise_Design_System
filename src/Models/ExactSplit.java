package Models;

public class ExactSplit extends Split {
  public ExactSplit (User owingUser, double amount){
    super(owingUser);
    this.setAmount(amount);
  }
}