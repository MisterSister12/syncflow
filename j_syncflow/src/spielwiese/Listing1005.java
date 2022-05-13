package spielwiese;

public class Listing1005
{
  public static void inc1(IntWrapper w)
 {
    ++w.value;
  }

  public static void inc2(int[] i)
  {
    ++i[0];
  }

  public static void main(String[] args)
  {
    //Variante 1: �bergabe in einem ver�nderlichen Wrapper
    IntWrapper i = new IntWrapper(10);
    System.out.println("i = " + i.value);
    inc1(i);
    System.out.println("i = " + i.value);
    //Variante 2: �bergabe als Array-Element
    int[] j = new int[] {10};
    System.out.println("j = " + j[0]);
    inc2(j);
    System.out.println("j = " + j[0]);
  }
}
