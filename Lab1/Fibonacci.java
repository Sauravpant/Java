import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth fibonacci term you want to get : >1");
    int number = sc.nextInt();
    int[] arr = new int[number + 1];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i <= number; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    System.out.println("The nth fibonacci number is " + arr[number]);
    sc.close();
  }

}