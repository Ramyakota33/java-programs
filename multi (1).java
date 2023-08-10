class Animal
{
 public void eat()
{
System.out.println(" can eat");
}
}
class crow extends Animal
{
 public void fly()
  {
System.out.println("can fly");
}
}
class babycrow extends crow
{
 public void bark()
  {
System.out.println("can bark");
}
}
class multilevelinheritance
{
public static void main(String[] args)
{
babycrow b=new babycrow();
b.fly();
b.eat();
b.bark();
  }
}
