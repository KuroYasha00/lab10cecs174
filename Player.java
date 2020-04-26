
public class Player{
  public String name;
  public int money;
  public int Dice;
  
  public Player(String name, int money){
    this.name = name;
    this.money = money;
    Roll();
    
  }
  public void Roll(){
    Dice.RollDice();
    Dice = Dice.GetDice();
  }
  public int Lose(){
    int minus = 50;
    money = money - minus;
    return money;
  }
  public int GetMoney(){
    return money;
  }
  public String GetName(){
    return name;
  }
  public int Win(){
    int plus = 50;
    money = money + plus;
    return money
  }
}
