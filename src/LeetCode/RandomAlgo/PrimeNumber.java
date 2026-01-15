package LeetCode.RandomAlgo;

public class PrimeNumber {
    public boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i=2; i*i<=num; i++){
           if(num%i==0) {
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();

        /*int num = 15;
        boolean result = primeNumber.isPrime(15);
        System.out.println(result);  // code to check if the number is prime
        if num = 15, i=2,3
        if i=3, num%i = 15/3 =0 -> not a prime number */

        //code to print all the prime numbers from 1 to 100
        System.out.println("Prime numbers from 1 to 100 are: ");
        for (int i =1; i<=100; i++ ) {
            if (primeNumber.isPrime(i)) {
                System.out.print(i + "\t");
            }
        }

    }
}
