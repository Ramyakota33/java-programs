class A
  {
    void msg()
    {
      System.out.println("hello");
    }
  }
class B
  {
    void msg()
    {
      System.out.println("hi");
    }
  }
class c extends A,B
  {
    public static void main(String args[])
    {
      c obj=new c();
      obj.msg();
    }
  }
  