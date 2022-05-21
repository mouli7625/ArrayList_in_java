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
        String element;
        element =scanner.next();
        val = list.contains(element);
        if(val== true)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element  not found");
        }

    }
}