class  Example
  {
    void display(double pi,int radius)
    {
      System.out.println("area of corcle is"+(pi*radius*radius));
    }
void display(float side)
    {
    System.out.println("area of side is"+(side*side));
    }
void display(int length,int breadth)
    {
      System.out.println("area of rectangle is"+(length*breadth));
    }
  }
class method
  {
    public static void main(String args[])
    {
      Example E=new Example();
      E.display(2.5,4);
      E.display(6);
      E.display(5,6);
    }
  }