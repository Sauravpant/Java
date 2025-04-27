import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number to check : > 1");
    int number = sc.nextInt();
    Boolean flag = true;
    for (int i = 2; i <= number; i++) {
      if (number % i == 0) {
        System.out.println("The number is not a prime number");
        flag = false;
        break;
      }
    }
    if (flag) {
      System.out.println("The number is prime number");
    }

    sc.close();
  }
}
