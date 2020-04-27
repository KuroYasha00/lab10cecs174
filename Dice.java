public class Dice{
    public int topFace;//declaring one int var called topFace

    public Dice(int topFace){//constructor will assign a value to topFace and then return it
        RollDice();
        GetDice();
        this.topFace = topFace;
    }
    public void RollDice(){//assigns a random number to topFace of dice of numbers 1 to 6
        topFace = (int)(Math.random()*6)+1;
    }
    public int GetDice(){//will retrun the integer of the top face of the dice
        return topFace;
    }
}// end of class Dice
