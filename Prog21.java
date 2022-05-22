import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> l =new ArrayList<String>();
        l.add("red");
        l.add("blue");
        l.add("black");
        l.add("green");
        String element;
        element=scanner.next();
        System.out.println("Element before replacing 2nd element");
        System.out.println(l);
        l.set(1, element);
        System.out.println("Element after replacing 2nd element");
        System.out.println(l);
    }
}


