/**
   A program that demonstrates the LinkedList class
*/
public class ListDemo
{  
   public static void main(String[] args)
   {  
      LinkedList staff = new LinkedList();
      staff.addFirst("Tom");
      staff.addFirst("Fiona");
      staff.addFirst("Vincent");
      staff.addFirst("Abby");
      staff.addFirst("Bart");
      staff.addFirst("Tyler");
      staff.addFirst("Alisa");
      staff.addFirst("Samantha");

      printList(staff);
      staff.set(4, "Vicki");
      staff.set(7, "John");
      staff.set(0, "Bethany");
      staff.set(6, "Kaitlyn");
      System.out.println("staff[3]=" + staff.get(3));
      System.out.println("staff[4]=" + staff.get(4));
      System.out.println("contains Bethany? " + staff.contains("Bethany"));
      System.out.println("contains Tom? " + staff.contains("Tom"));
      printList(staff);
      System.out.println(staff);
   }
   public static void printList(LinkedList list)
   {
       ListIterator iterator = list.listIterator();
       while (iterator.hasNext())
       {
          System.out.print(iterator.next() + " ");
       }
       System.out.println();
   }
}
