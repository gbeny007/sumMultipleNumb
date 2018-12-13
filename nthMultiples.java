
package nthMultiples;
import java.util.Scanner;


public class nthMultiples 
{

    
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
               
          System.out.println("Enter the Multiple value");
         int multiple = sc.nextInt();
         
         System.out.println("Enter the Maximum value");
         int maxValue = sc.nextInt();
                
      int sum = 0; 
      for(int i=0;i<=maxValue;i++)
      {
          if(i% multiple == 0)
          {
             sum = sum + i;
          }
          {
              System.out.println("The sum of Multiples of 9 upto "+"" + +maxValue+ " is:" +sum);
          }
      }
      
    }
    
}
