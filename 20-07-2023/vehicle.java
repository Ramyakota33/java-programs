class Vehicle
  {
    void start_engine()
    {
      System.out.println("engine start");
    }
  }
class car extends Vehicle
{
  void start_engine()
  {
    System.out.println("car engine start");
  }
}
class motorcycle extends Vehicle
  {
    void start_engine()
    {
      System.out.println("motorcycle engine start");
    }
  }
class Engine
  {
    public static void main(String args[])
    {
      Vehicle v=new Vehicle();
       v.start_engine();
      Vehicle car=new car();
      car.start_engine();
      Vehicle m=new motorcycle();
      m.start_engine();
    }
  }
