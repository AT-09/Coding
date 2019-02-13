
/*
 *   this is a game call bulls and cows
 *
 */
public class BullsAndCows {

    private String numbers;
    int turns;

    public BullsAndCows(String numbers)
    {
        this.numbers = numbers;
    }
    public BullsAndCows(String numbers, int turns)
    {
        this.numbers = numbers;
        this.turns = turns;
    }

    public static int returnCountBulls(BullsAndCows numbersHidden, BullsAndCows numberTry)
    {
        int countBull = 0;

        for(int i = 0; i < numbersHidden.numbers.length(); i++)
        {
            char count1 = numbersHidden.numbers.charAt(i);
            char count2 = numberTry.numbers.charAt(i);
            if(count1 == count2)
                countBull++;
        }
        return countBull;
    }

    public static int returnCountCows(BullsAndCows numbersHidden, BullsAndCows numberTry)
    {
        int countCow = 0;

        for(int i = 0;  i < numbersHidden.numbers.length(); i++)
        {
            char count1 = numbersHidden.numbers.charAt(i);
            for(int j = 0;  j < numbersHidden.numbers.length(); j++)
            {
                char count2 = numberTry.numbers.charAt(j);
                if (count1 == count2 && i != j)
                    countCow++;
            }
        }
        return countCow;
    }

    public static String verifyNumberResult(BullsAndCows numbersHidden, BullsAndCows numberTry)
    {

        if(numbersHidden.numbers == numberTry.numbers && numberTry.turns <= 8) {
            return  "You win!";
        }

        return "Sorry, you're out of turns!";

    }
}
