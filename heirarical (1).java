class Animal
{
 public void eat()
{
System.out.println(" can eat");
}
}
class  rat extends Animal
{
 public void noise()
  {
System.out.println("can noise");
}
}
class cat extends Animal
{
 public void run()
  {
System.out.println("can run");
}
}
class heirarical
{
public static void main(String[] args)
{
rat r=new rat();
  cat c=new cat();
r.noise();
  c.run();
  }
}