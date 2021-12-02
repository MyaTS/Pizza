import java.util.Scanner;

public class calculator{

    public static int mult(int a, int b)
    {
        int c = a;
        int d = a;
  
        while (--b > 0) 
        {
            a = d; 
        
            while (a > 0) { 
                a--; 
                c++; 
            }
     
            while (a < 0) {
                a++;
                c--;
            }
        }
    
        if (b < 0)
        {
            c = -a;
            ++b;
    
            while (++b < 0)
            {   
                a = d; 

                while (a > 0) {
                    a--;    
                    c--;
                }
     
                while (a < 0) {
                    a++;  
                    c++;
                }
            }
        }
        
        return c;
    }

    public static int power(int base, int power)
    {
        int result = 0;

        if(power == 0)
        {
            return 1;
        }
        else if(power == 1)
        {
            return base;
        }
        else if(power > 1) // power greater than 2
        {
            // first mult
            result = mult(base, base);

            for (int i = 0; i < power - 2; i++) {
                result = mult(result, base);
            }
        }

        return result;
    }

    public static void main(String[] args){
    

        Scanner in = new Scanner(System.in);

        System.out.println("Please select an operation -");
        System.out.println("1. Add two integers");
        System.out.println("2. Multiply two integers");
        System.out.println("3. Calculate a to the power of b");
        System.out.println("4. Calculate n!");
        System.out.println("5. Exit");

        boolean stop = true;

        while (stop == true)
        {
            System.out.print("Enter your choice (1, 2, 3, 4, 5): ");
            int choice = in.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter the first integer: ");
                int a = in.nextInt();
                System.out.print("Enter the second integer: ");
                int b = in.nextInt();

                while (a > 0) {
                    a--;
                    b++;
                }
         
                while (a < 0) {
                    a++;
                    b--;
                }
         
                System.out.print("The sum of the 2 integers is: " + b + "\n");

            }
            else if (choice == 2)
            {
                System.out.print("Enter the first integer: ");
                int a = in.nextInt();
                System.out.print("Enter the second integer: ");
                int b = in.nextInt();

                int c = mult(a, b);

                System.out.print("The multiple of the 2 integers is: " + c + "\n");
            
            }
            else if (choice == 3)
            {
                System.out.print("Enter the first number: ");
                int a = in.nextInt(); 
                System.out.print("Enter the second number: ");
                int b = in.nextInt();

                int powerResult = power(a, b);

                System.out.print("The power of the 2 integers is: " + powerResult + "\n");

            }
            else if (choice == 4)
            {
                System.out.print("Enter the integer 'n': ");
                int n = in.nextInt();

                int result = n;
                int operand2 = n - 1;

                if (n == 0)
                {
                    result = 1;
                }
                else
                {
                    for (int i = 0; i < n - 1; i++) 
                    {
                        result = mult(result, operand2);
                        operand2--;
                    }
                }

                System.out.print("The factorial of n is: " + result + "\n");
                
            }
            else if (choice == 5)
            {
                stop = false;
            }
        }

    }
}