import java.util.Scanner;
public class lab100{
    static Scanner S= new Scanner(System.in);

    public static void main(String[] args) {
        Player p1 = new Player("mark", 200);
        Player p2 = new Player("com", 200);
        int p1die, p2die, bet;
        p1die = p1.Roll();
        p2die = p2.Roll();
        System.out.println("Hello player "+p1.GetName()+" you have a balance of "+p1.GetMoney());
        System.out.println("How much do you want to bet?");
        bet = S.nextInt();
        System.out.println(p1.GetName()+" rolled "+p1die+"\n"+p2.GetName()+" rolled "+p2die);
        if (p1die > p2die){
            p1.Win(bet);
            System.out.println(p1.GetName()+" won.\nYour new balance is "+p1.GetMoney());
        }
        if (p1die < p2die){
            p2.Win(bet);
            System.out.println(p1.GetName()+" lost.\nYour new balance is "+p1.GetMoney());
        }
        if (p1die == p2die){
            System.out.println("it is a tie");
        }
    }
}
