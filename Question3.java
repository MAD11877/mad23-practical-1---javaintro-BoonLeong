import java.util.Scanner;

class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Integer: ");
    int num = in.nextInt();
    
    int newnum = num * num;
    System.out.println(newnum);
  }
}
