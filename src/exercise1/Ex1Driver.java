package exercise1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * @author yasiro01
 */
public class Ex1Driver {

    private static int i;
    private static int a;
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println(" ");
    System.out.println("---task 1---");
    System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    System.out.println(" ");
    System.out.println("---task 2---");
    for(int i=1;i<=100;i++){
        if(i%3==0){
            System.out.println("foo");
            continue;
        }
        else if(i%5==0){
            System.out.println("Bar");
            continue;
        }
        else if(i%3==0&&i%5==0){
            System.out.println("Huh");
            continue;
        }
        System.out.println(i);
    }
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    System.out.println(" ");
    System.out.println("---task 3---");
    int sum = 0;
    for (int i=1; i<=100; ++i) {
        if (i % 7 == 0) {
            sum +=i;
        }
    }
    System.out.println(sum);
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    System.out.println(" ");
    System.out.println("---task 4---");
    int sum = 0;
    for (int i =1; i <=20; ++i) {
        sum += i;
    }
  System.out.println(sum);
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println(" ");
    System.out.println("---task 5---");
    Scanner myKeyboard = new Scanner(System.in);
   
   
    System.out.print("Please enter your full name: ");
    String name = myKeyboard.nextLine();
   
    String[] nameParts = name.split(" ");
   
    char firstiniti = nameParts[0].charAt(0);
    char seciniti = nameParts[1].charAt(0);
    char thirdiniti = nameParts[2].charAt(0);
   
    System.out.println("Initials are " + firstiniti +seciniti + thirdiniti);
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.println(" ");
    System.out.println("---task 6---");
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
        numbers[i] = i * i * i;
    }
    System.out.println(Arrays.toString(numbers));
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  @SuppressWarnings("empty-statement")
  public static void task7() {
      System.out.println(" ");
    System.out.println("---task 7---");
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] randomNumbers = new int[100];
    for (@SuppressWarnings("LocalVariableHidesMemberVariable")
int i = 0; i < randomNumbers.length; i++) {
      randomNumbers[i] = rnd.nextInt(101-10);
  }
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number: ");
    String guessString = keyboard.nextLine();
    int guess = Integer.parseInt(guessString);
    boolean found = false;
    for (int index = 0; index < randomNumbers.length; ++index) {
        if (randomNumbers[index] == guess) {
            found = true;
            break;
        }
    }
    if (found == true) {
        System.out.printf("%d was found in the array%n", guess);
    }
    else {
        System.out.printf("%d was not found in the array%n", guess);
    }
        }
   
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return
   */
  public static int task8(int[] numbers) {
    System.out.println(" ");
    System.out.println("---task 8---");
    int sum = 0;
    String arrayNum = "";
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
        arrayNum += numbers[i] + " ";
    }
    System.out.printf("Sum of all items in [%s] is %d%n", arrayNum, sum);
    return sum;
    }
   


  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return
   */
  public static boolean task9() {
    System.out.println(" ");
    System.out.println("---task 9---");
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter a word%n");
    String inputword = keyboard.nextLine();
    boolean inorder = true;
    for (int i = 0; i < (inputword.length()- 1); i++) {
        int od1 = (int) inputword.charAt(i);
        int od2 = (int) inputword.charAt(i + 1);
        if (od1 > od2) {
            inorder = false;
            break;
        }
    }
    System.out.println(inorder);
    return inorder;
        }

    private static void task10() {
        boolean[] isComposite = new boolean[100 + 1];
        for (int i = 2; i <= 10; i++) {
            if (!isComposite[i]) {
                System.out.print(i + " ");
                for (int k = i * i; k <= 100; k += i)
                    isComposite[k] = true;
            }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        for (int i = 10; i <= 100; i++)
            if (!isComposite[i])
                System.out.print(i + " ");
    }

        

}


