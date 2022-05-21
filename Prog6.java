import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        List<String> list =new ArrayList<String>();
        list.add("red");
        list.add("blue");
        list.add("black");
        list.add("green");
        System.out.println("List before Removing 3rd element");
        System.out.print(list);
        System.out.println();
        list.remove(2);
        System.out.println("List after Removing 3rd element");
        System.out.print(list);
    }
}