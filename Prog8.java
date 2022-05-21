import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        boolean val=false;
        List<Integer> list =new ArrayList<Integer>();
        list.add(55);
        list.add(5);
        list.add(1);
        list.add(100);
        list.add(53);
        System.out.println("List before sorting in arranging order");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("List after sorting in ascending order");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("List after sorting in descending order");
        System.out.println(list);
        
    }
}