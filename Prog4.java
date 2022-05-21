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
        int pos=0;
        pos =scanner.nextInt();
        if(pos >= list.size())
        {
            System.out.println("Invalid position");
        }
        else
        {
            System.out.println(list.get(pos));
        }

    }
}