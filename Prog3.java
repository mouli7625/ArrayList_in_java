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
        System.out.println("List Before Inserting element");
        System.out.println(list);
        int pos=0;
        String element;
        pos =scanner.nextInt();
        if(pos> list.size())
        {
            System.out.println("Invalid position");
        }
        else
        {
            element =scanner.next();
            list.add(pos, element);
            System.out.println("List After Inserting element");
            System.out.println(list);
        }

    }
}