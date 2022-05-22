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
        System.out.println("List before extracting a portion");
        System.out.println(list);
        List<String> sub_list= list.subList(0,2);
        System.out.println("List after rextracting a portion");
        System.out.println(sub_list);

    }
}