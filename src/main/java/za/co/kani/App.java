package za.co.kani;

public class App 
{
    public static void main( String[] args )
    {
        Gym first = new Gym("Kani");
        first.upgradeToGold();
        System.out.println(first.getSummary());
    }
}
