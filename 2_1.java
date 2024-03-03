class test {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
  
    System.out.print("Enter a miles: ");
    double miles = input.nextDouble();
    double kilometers = miles * 1.6;
    System.out.printf("%.1f miles is %.1f kilometers", miles, kilometers);
  }
}
