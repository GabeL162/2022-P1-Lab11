// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        for(int k=2;k< primes.length;k++){
            primes[k] = true;
    }
        // Step 2: Removing multiples of primes
        //hint: nested loop
        //use different variable for outside loop that adds 1 to itself every loop

        for(int index = 2; index < primes.length; index++){
            for(int k = index * 2; k < primes.length; k+=index){
                primes[k] = false;
            }
            }
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();

        for(int k=1;k< primes.length;k++){
            if(primes[k]== true)
            System.out.print(k + " ");
        }
    }

}

