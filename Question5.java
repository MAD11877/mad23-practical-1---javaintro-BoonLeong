import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int arrayLength = in.nextInt();
    int[] a = new int[arrayLength];
    
    for (int i = 0; i < a.length; i++)
    {
        int newInt = in.nextInt();
        a[i] = newInt;
    }
    
    int modeInt = a[0];
    int modeIntReps = 0;
    
    for (int i = 0; i < a.length; i++)
    {
        int reps = 0;
        if (i == 0 || a[i] != modeInt)
        {
            for (int ii = 0; ii < a.length; ii++)
            {
                if(a[i] == a[ii])
                {
                    reps += 1;
                }
            }
            
            if (reps > modeIntReps)
            {
                modeIntReps = reps;
                modeInt = a[i];
            }
        }
    }
    
    System.out.print(modeInt);
    
  }
}
