public class IfCheck
{
   public static void main(String[] args)
   {
      //declare variables
      double one;
      double two;
      double product;
      
      //get numbers from user
      one = IO.readDouble("Enter a number ");
      two = IO.readDouble("Enter a second number ");
      
      //if then to determine order
      if (one > two)
      {
         System.out.println(one - two);
      }
      else
      {
         System.out.println(two - one);
      }
      
      //multiply the numbers
      product = one * two;
      
      //if then to declare if positive or negative
      if (product > 0)
      {
         System.out.println("Product is positive");
      }
      else
      {
         System.out.println("Product is negative");
      }
   }
}