public class MyClass1 {
     public static void main(String args[])
  {
    char name[]={'A','B','C', 'D', 'E'};
    String name1[]={"Souvik","Jhuma","Dhiman","Ronny","Diya"};
    
    for(int i=1;i<name.length;i++)
    {
     // System.out.print(name[i]+", ");
      System.out.println(i+") "+name1[i]+", ");
    }
    
    for(int j=0;j<name1.length-1;j++)
    {
      name[j]=name[j+1];
      System.out.println(j+") "+name[j]+", ");
    }
   
  }
}