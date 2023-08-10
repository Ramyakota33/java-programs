//write a java program to print the duplicate arrays 
class Main
  {
  public static void main (String[] args)
    {
    int arr[]= new int[] {11,12,14,16,17,14};
    System.out.println("print duplicate arrays");
    for(int i=0;i<arr.length;i++) 
    {
      for(int j=0;j<arr.length;j++)
        {
       if(arr[i]==arr[j])
         System.out.println(arr[j]);
    }
    
  }
}
}