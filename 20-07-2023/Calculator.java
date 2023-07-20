class Cal
  {
    void addition(int a,int b)
    {
      int sum=a+b;
      System.out.println("sum is"+sum);
    }
void addition(int a,int b,int c)
  {
  int sum=a+b+c;
  System.out.println("sum is"+sum);
  }
    void addition(int a,int b,int c,int d)
    {
      int sum=a+b+c+d;
      System.out.println("sum is"+sum);
    }
  }
    class Calculator
      {
        public static void main(String args[])
        {
          Cal c=new Cal();
        c.addition(4,5);
        c.addition(5,6,9);
       c.addition(5,8,9,3);
      }
  }