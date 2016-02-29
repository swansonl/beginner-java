//Lindsay Swanson
//1/11/2016

public class TestScore
{
   public static void main(String[] args)
   {
      //declare variables
      double s;
      
      //get a variable from the user
      s = IO.readDouble("Enter your test score: ");
      
      //if else to determine if its above or below
      if (s > 65.0)
      {
         //tell the user its above ("passing")
         System.out.println("Passing");
      }
      else
      {
         //tell the user its below ("failing")
         System.out.println("Failing");
      }
   }
  
}