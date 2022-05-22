import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        List<String> list =new ArrayList<String>();
        list.add("red");
        list.add("blue");
        list.add("black");
        list.add("green");
        System.out.println("List 1");
        System.out.println(list);
        List<String> list2 =new ArrayList<String>();
        list2.add("red");
        list2.add("Amber");
        list2.add("black");
        list2.add("green");
        System.out.println("List 2");
        System.out.println(list2);
        List<String> list3 =new ArrayList<String>();
        for(String e: list)
        {
            if(list2.contains(e))
            {
                list3.add("Yes");
            }
            else
            {
                list3.add("No");

            }
        }
        System.out.println(list3);
    }
}