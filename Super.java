class person
  {
    String name="ramya";
    String address="vja";
    void display()
    {
      System.out.println(name+" "+address);
    }
  }
class Student extends person
{
  String sname="lakshmi";
  int sage=22;
  void display()
  {
    System.out.println(sname+" "+address);
    super.display();
  }
  void print()
  {
    System.out.println("details of person");
    super.display();
  }
}
 class Super
    {
      public static void main(String args[])
      {
      Student s=new Student();
      s.display();
         }

}
