class grandfather
{
void surname()
  {
System.out.println("surname");
  }
}
class father extends grandfather
{
void features()
  {
System.out.println("features");
  }
}
class son extends father
  {
void properties()
    {
System.out.println("properties");
}
}
class daughter extends father
  {
void similarities()
    {    
System.out.println("similarities");
  }
  }
class hybrid
{
public static void main(String args[])
  {
son obj=new son();
obj.surname();
  }
}
