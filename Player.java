public class Player{
    public String name;
    public int money;
    Dice d1 = new Dice(1);

    public Player(String name, int money){
        this.name = name;
        this.money = money;
        Roll();

    }
    public int Roll(){
        d1.RollDice();
        return d1.GetDice();
    }
    public <bet> void Lose(int bet){
        int minus;
        minus = bet;
        money = money - minus;
    }
    public int GetMoney(){
        return money;
    }
    public String GetName(){
        return name;
    }
    public <bet> void Win(int bet){
        int plus;
        plus = bet;
        money = money + plus;
    }
}
