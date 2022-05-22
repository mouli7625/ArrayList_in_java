import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        ArrayList<String> l =new ArrayList<String>();
        l.add("red");
        l.add("blue");
        l.add("black");
        l.add("green");
        System.out.println("List before eempty its content");
        System.out.println(l);
        l.removeAll(l);
        System.out.println("List after eempty its content");
        System.out.println(l);
    }
}


