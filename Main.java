import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    //function to checkPalindrome
    public void checkPalindrome()  {
        System.out.print("Enter Palindrome value: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())) System.out.println("It is Palindrome");
        else System.out.println("It is not a Palindrome");
    }

    //function to printPattern
    public void printPattern() {
        System.out.print("Enter value: ");
        int s = sc.nextInt();
        for(int i = 1; i<=s; i++){
            for (int j = s; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //function to check no is prime or not
    public void checkPrimeNumber() {
        System.out.print("Enter value: ");
        boolean prime = true;
        int s = sc.nextInt();
        if (s % 2 == 0) {
            System.out.println("It is not a Prime Number");
            prime = false;
        }
        else
            for (int i = 3; i * i <= s; i += 2) {
                if (s % i == 0) {
                    System.out.println("It is not a Prime Number");
                    prime = false;
                    break;
                }
            }
         if (prime)
            System.out.println("It is a Prime Number");
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries() {
        System.out.print("Enter value: ");
        int s = sc.nextInt();
        int first = 0, second = 1, next;
        for(int i=1; i<=s; i++)
        {
            next = first + second;
            System.out.print(first);
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                    obj.checkPalindrome();
                }
                break;
                case 2: {
                    obj.printPattern();
                }
                break;
                case 3: {
                    obj.checkPrimeNumber();
                }
                break;
                case 4: {
                    obj.printFibonacciSeries();
                }
                break;
                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}

