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
        l.trimToSize();
        System.out.print(l);
    }
}


