class Distance {
  private int feet;
  private float inches;

  Distance(int ft, float inch) {
    feet = ft;
    inches = inch;
  }

  public void addDistance(Distance d) {
    int newFeet = feet + d.feet;
    float newInches = inches + d.inches;
    if (newInches >= 12) {
      newFeet += (int) (newInches / 12);
      newInches = newInches % 12;
    }
    System.out.println("The total distance is: " + newFeet + " feet and " + newInches + "inches");
  }

  public void Compare(Distance d) {
    if (feet > d.feet && inches > d.inches)
      System.out.println("Distance 1 is greater than Distance 2");
    else
      System.out.println("Distance 2 is greater than Distance 1");
  }

}

public class Convert {
  public static void main(String[] args) {
    Distance d1 = new Distance(5, 14);
    Distance d2 = new Distance(7, 10);
    d1.addDistance(d2);
    d1.Compare(d2);
  }
}
