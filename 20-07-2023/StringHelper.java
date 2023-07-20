class Strings
  {
    void concatenate(String str1 ,String str2)
    {
      System.out.println("concat"+str1.concat(str2));
       }
void concatenate(String str1,String str2,String str3)
  {
System.out.println("concatenate"+str1.concat(str2)+str2.concat(str3));
  }
  }
class StringHelper
  {
    public static void main(String args[])
    {
      Strings str=new Strings();
    str.concatenate("hello","ramya");
str.concatenate("welcometo","bitlabs","asintern");
  }
  }
  
