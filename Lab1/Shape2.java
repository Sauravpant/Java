import java.util.Scanner;

class Cylinder {
  private double radius;
  private double height;

  public void setData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the cylinder in meter:");
    radius = sc.nextDouble();
    System.out.println("Enter the height of the cylinder in meter:");
    height = sc.nextDouble();
  }

  public void displayData() {
    double volume = 3.14 * radius * radius * height;
    System.out.println("The radius of cylinder is " + radius);
    System.out.println("The height of cylinder is " + height);
    System.out.println("Total Volume is: " + volume + " cubic meter");
  }
}

public class Shape2 {
  public static void main(String[] args) {
    Cylinder r1 = new Cylinder();
    Cylinder r2 = new Cylinder();
    r1.setData();
    r1.displayData();
    r2.setData();
    r2.displayData();
  }
}
