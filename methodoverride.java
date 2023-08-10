class Methodoverride
  {
    void sides()
    {
      System.out.println("rectangle has 4 sides");
    }
  }
  class square extends Methodoverride
    {
      void sides()
      {
        System.out.println("square has 4 sides");
      }
      }
 class triangle extends Methodoverride
    {
      void sides()
      {
        System.out.println("triangle has 4 sides");
      }
      } 
class circle extends Methodoverride
    {
      void sides()
      {
        System.out.println("circle have no sides");
      }
      }
class Test
  {
    public static void main(String args[])
    {
     Methodoverride methodoverride=new methodoverride();
      methodoverride.sides();
      Methodoverride square=new square();
      square.sides();
      Methodoverride triangle=new triangle();
      triangle.sides();
      Methodoverride circle=new circle();
      circle.sides();
      
    }
  }