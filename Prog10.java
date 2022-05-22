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
        System.out.println("List before shuffle");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("List after shuffle");
        System.out.println(list);

    }
}