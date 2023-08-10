class Animal
  {
    String name;
    String color;
    String breed;
   void display()
    {
      System.out.println("displaying");
    }
  }
class dog extends Animal
{
  void display()
  {
    System.out.println(name+" "+color+" "+breed);
  }
}
class singleinheritances
  {
    public static void main(String args[])
    {
      dog d=new dog();
      d.name="kala";
      d.color="black";
      d.breed="germanshepard";
      d.display();
    }
  }