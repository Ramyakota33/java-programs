class Animal
{
 public void eat()
{
System.out.println(" can eat");
}
}
class Fox extends Animal
{
 public void bark()
  {
System.out.println("can barking");
}
}
class inheritance
{
public static void main(String[] args)
{
Fox f=new Fox();
f.eat();
f.bark();
  }
}


