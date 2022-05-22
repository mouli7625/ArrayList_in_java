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
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        System.out.println("List 2");
        System.out.println(list2);
        List<String> list3 =new ArrayList<String>();
        list3.addAll(list);
        list3.addAll(list2);
        System.out.println("Joined List");
        System.out.println(list3);
    }
}