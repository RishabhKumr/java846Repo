class EmployeeManagement{
public static void add(int a,int b)
{
System.out.println("Sum");
}
  public void diff(int a,int b)
  {
    System.out.println("Diff"+(a-b));
  }
  public void prod(int a,int b)
  {
    System.out.println(a*b);
  }
  public void div(int a,int b)
  {
    System.out.println(a/b);
  }
  public static void main(String args[])
  {
    System.out.println(add(1,2));
  }
}
