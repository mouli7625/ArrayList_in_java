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
        System.out.println("List 1");
        System.out.println(l);
        // 1st way
        List<String> clone_list =new ArrayList<String>(l);
        System.out.println( clone_list);


        //2nd way
        ArrayList<String> clone_list2= (ArrayList<String>)l.clone();
        System.out.println( clone_list2);

    }
}


