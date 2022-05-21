import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        boolean val=false;
        List<String> list =new ArrayList<String>();
        list.add("red");
        list.add("blue");
        list.add("black");
        list.add("green");
        System.out.println("List before replacing");
        System.out.print(list);
        System.out.println();
        String element, replace;
        int index=0;
        element =scanner.next();
        replace =scanner.next();
        val = list.contains(element);
        if(val== true)
        {
            index=list.indexOf(element);
            list.set(index, replace);
            System.out.println("List after replacing");
            System.out.print(list);
        }
        else
        {
            System.out.print("Element not present");
        }

    }
}