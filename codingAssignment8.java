import java.util.Scanner;


public class codingAssignment8 {
    
    


    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //Methods
        System.out.println(square(17));
        System.out.println(factorial(5));
        System.out.println(primeNumber(7));
        
        System.out.println("Input n:");
		int s = keyboard.nextInt();
		System.out.println("Input r:");
		int r = keyboard.nextInt();
		int z = combination(s,r);
		System.out.println(z);

        System.out.println("Enter number to see if it's prime:");
		int number = keyboard.nextInt();
		boolean answer = primeNumber(number);
		System.out.println(answer);
		System.out.println("The 1000000th prime number is " + millionth());

    }
    //1 - method for squaring values.
    public static int square(int x)
    {
        int result = x*x;
        return result; // returns must happen in non-void methods 
    }

    //2 - Factorial 
    public static int factorial(int y) 
    {
        int fact = 1;
        for(int i=1;i<=y;i++){    
            fact=fact*i; 
        }   
        return fact;
    }   

    //3 - Combinations calculator
    public static int combination (int s,int r)
	{
		int z = factorial (s) /(factorial(r)*factorial(s-r));
		return z;
	}

    
    //4 - prime number
    public static boolean primeNumber(int z) 
    {

        int primeNumber = 1;
        boolean flag = false;
        for (int i = 2; i <= z / 2; ++i) {
          // condition for nonprime number
          if (i % z == 0) {
            flag = true;
            break;
          }
        }
    
       return !flag;
      }

    //5 - Millionth thing
    public static int millionth ()
	{
		int count = 0 ;
		int current = 1;
		while (count <1000000)
		{
			current++;
			if(primeNumber(current))
					{
				count++;
					}
				
		}
		return current;
	}

    
    
}
