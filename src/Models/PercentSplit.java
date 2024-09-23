package Models;
public class PercentSplit extends Split{
  private double percentage;
  public PercentSplit(User owingUser, double percentage){
    super(owingUser);
     this.percentage = percentage;
  }
  public double getPercentage(){
    return percentage;
  }
  public void setPercentage(double percentage){
    this.percentage = percentage;
  }
}