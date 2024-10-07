public class LongestStreak extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
        int countH = 0;
        int countT = 0;
        int countH2 = 0;
        int countT2 = 0;
        int countH3 = 0;
        int countT3 = 0;
        
        for (int i = 0; i < 100; i++)
        {
            int coin = Randomizer.nextInt(1, 2);
            
            if (coin == 2)
            {
                System.out.println("Heads");
                countH += 1;
                countH2++;
                
                if (countH2 >= countH3)
                {
                    countH3 = countH2;
                }
                countT2 = 0;
            }
            else
            {
                System.out.println("Tails");
                countT += 1;
                countT2++;
                
                if (countT2 >= countT3)
                {
                    countT3 = countT2;
                }
                countH2 = 0;
            }
        }
        System.out.println("Heads: " + countH);
        System.out.println("Tails: " + countT);
        System.out.println("Longest streak of heads: " + countH3);
        System.out.println("Longest streak of tails: " + countT3);
        
    }
}
