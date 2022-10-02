package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int firstLiteral = 'Z';
        int secondLiteral = 0xface;
        int thirdLiteral = 012;

        long fourthLiteral = 80L;
        int fourth = (int)fourthLiteral;

        float fifthLiteral = 44e-1f;
        int fifth = (int)fifthLiteral;

        float sixthLiteral = 5.5f;
        int sixth = (int)sixthLiteral;

        double seventhLiteral = 8.88e1;
        int seventh = (int)seventhLiteral;

        double eighthLiteral = 99.9;
        int eighth = (int)eighthLiteral;

        int sum = firstLiteral + secondLiteral + thirdLiteral + fourth + fifth + sixth + seventh + eighth;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();
        int secondNumber = scanner1.nextInt();

        System.out.println(firstNumber + secondNumber);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();
        int secondNumber = scanner1.nextInt();

        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        firstNumber -= secondNumber;
        secondNumber += firstNumber;
        firstNumber = secondNumber - firstNumber;

        System.out.println("After Swap:");
        System.out.println("x: " + firstNumber);
        System.out.println("y: " + secondNumber);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();
        int secondNumber = scanner1.nextInt();

        System.out.print("n1: ");
        System.out.print("n2: ");

        if (firstNumber > secondNumber)
        {
            System.out.println("n1 > n2");
        }
        else if (secondNumber > firstNumber)
        {
            System.out.println("n2 > n1");
        }
        else
        {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner1 = new Scanner(System.in);
        int revenue = scanner1.nextInt();

        System.out.print("Enter annual Revenue: ");

        if (revenue < 0 || revenue >= 100000)
        {
            System.out.println("Invalid Revenue");
        }
        else if (revenue >= 0 && revenue < 20000)
        {
            System.out.println("Poor Sales Revenue");
        }
        else if (revenue >= 20000 && revenue < 50000)
        {
            System.out.println("Average Sales Revenue");
        }
        else if (revenue >= 50000 && revenue < 80000)
        {
            System.out.println("Good Sales Revenue");
        }
        else if (revenue >= 80000 && revenue < 100000)
        {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner1 = new Scanner(System.in);
        int commissionClass = scanner1.nextInt();
        double commissionRate;

        System.out.print("Enter CommissionClass: ");

        if (commissionClass >= 1 && commissionClass <= 4)
        {
            commissionRate = ((double)commissionClass / 100);
        }
        else
        {
            commissionRate = 0.00;
        }

        System.out.println("Your Commission Rate was set to " + commissionRate);
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner1 = new Scanner(System.in);
        int year = scanner1.nextInt();

        System.out.print("Year: ");

        if (year % 4 == 0 && year % 400 == 0)
        {
            System.out.println("Leapyear");
        }
        else if(year % 100 == 0 && year % 400 != 0)
        {
            System.out.println("Not a Leapyear");
        }
        else
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        System.out.print("Number: ");


        if (String.valueOf(number).length() == 3)
        {
            int firstDigit;
            int secondDigit;
            int thirdDigit;

            firstDigit = number % 10;
            secondDigit = number / 10;
            secondDigit = secondDigit % 10;
            thirdDigit = number / 100;

            System.out.println("" + firstDigit + "" + secondDigit + "" + thirdDigit);
        }
        else if (String.valueOf(number).length() == 2)
        {
            int firstDigit;
            int secondDigit;

            firstDigit = number & 10;
            secondDigit = number / 10;
            System.out.print("" + firstDigit + "" + secondDigit);
        }
        else if (String.valueOf(number).length() == 1)
        {
            System.out.print(number);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}