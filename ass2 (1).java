//Create a class called "Vehicle" with the following attributes:
///String make
//String model
//int numDoors
//boolean isConvertible//
class vehicle
  {
    String make="maruthi";
  }
class model extends vehicle
  {
    String model="ertiga";
    int numofdoors=4;
  }
class convertable extends model{
  boolean b=true;
  public static void main(String args[])
  {
    convertable c=new convertable();
    System.out.println(c.make);
    System.out.println(c.model+" "+"the doors are"+c.numofdoors);
    System.out.println("is convertable"+c.b);
    }
}