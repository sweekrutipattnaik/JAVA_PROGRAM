public class SimpleInterest{
    public static void main(String[] args) {
  
      System.out.print("Principal = 9000: ");
      double principal = 9000;
  
      System.out.print("rate of interest = 10 : ");
      double rate = 10;
  
      System.out.print("number of years = 5 : ");
      int years = 5;
  
      double simpleInterest = (principal * rate * years) / 100;
      System.out.println("Simple Interest: " + simpleInterest);
    }
  }