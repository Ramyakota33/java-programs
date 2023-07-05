import java.util.Scanner;
class avg
  {
    public static void main(String args[])
    {
      int i,num=0,sum=0;
      double avg;
      {
        System.out.println("enter the 5 numbers");
      }
      for(i=0;i<5;i++)
        {
          Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sum +=num;
        }
      avg=sum/5;
      System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);
      
          
        }
  }
    
  