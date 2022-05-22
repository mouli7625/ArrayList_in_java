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
        int len=0, i;
        len=l.size();
        for(i=0;i<len;i++)
        {
            System.out.println(l.get(i));

        }
    }
}


