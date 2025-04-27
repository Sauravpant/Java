import java.util.Scanner;

class Rectangle {
  private double length;
  private double breadth;

  public void getData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle:");
    length = sc.nextDouble();
    System.out.println("Enter the breadth of the rectangle:");
    breadth = sc.nextDouble();
    sc.close();
  }

  public double displayArea() {
    return length * breadth;
  }

}

public class Shape1 {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.getData();
    System.out.println("The area of rectangle is: " + r.displayArea());
  }
}
