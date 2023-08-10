class week2
  {
    private String x;
    public String y;
    protected String z;
    String r;
  }
class week3
  {
    public static void main(String args[])
    {
      week2 obj=new week2();
      
      obj.y=6;
      obj.z=9;
      obj.r=11;
      System.out.println("y= "+obj.y  + " , z = "  + obj.z + " , r = " + obj.r);
    }
  }