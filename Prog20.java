import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> l =new ArrayList<String>(3);
        l.add("red");
        l.add("blue");
        l.add("black");
        System.out.println(l);
        l.ensureCapacity(5);
        l.add("Amber");
        l.add("Purple");
        System.out.println(l);
    }
}


