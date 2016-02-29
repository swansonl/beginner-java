//Lindsay Swanson
//1/11/2016

public class FindRange
{
   public static void main(String[] args)
   {
      //declare variables
      double ts;
      
      //get user input
      ts = IO.readDouble ("Enter a value: ");
      
      //use nested if then to deterine where value fits in range
      if (ts < 60.0)
      {
         System.out.println(ts + ":is in the range less than 60.0");
      }
      else
      {
         if (ts < 70.0)
         {
            System.out.println(ts + ":is in the range less than 70.0");
         }
         else
         {
            if (ts < 80.0)
            {
               System.out.println(ts + ":is in the range less than 80.0");
            }
            else
            {
               if (ts < 90.0)
               {
                  System.out.println(ts + ":is in the range less than 90.0");
               }
               else
               {
                  if (ts <= 100.0)
                  {
                     System.out.println(ts + ":is in the range less than or equal to 100.0");
                  }
                  else
                  {
                     if (ts > 100.0)
                     {
                        System.out.println(ts + ":is in the range greater than 100.0");
                     }
                  }
               }
            }
         }
      }
   }
}