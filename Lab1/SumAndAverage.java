import java.util.Scanner;

public class SumAndAverage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size pf the arrray ");
    int size = sc.nextInt();
    int[] numbers = new int[size];
    int sum = 0;
    System.out.println("Enter the elements:");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    System.out.println("The total sum of all elements is:" + sum);
    System.out.println("The average is:" + sum / size);
    sc.close();

  }
}
