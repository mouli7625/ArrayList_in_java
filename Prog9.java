import java.util.*;
class abc
{
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        List<String> list1 =new ArrayList<String>();
        list1.add("red");
        list1.add("blue");
        list1.add("black");
        list1.add("green");
        List<String> list2 =new ArrayList<String>();
       
        //using addAll()
        list2.addAll(list1);
        System.out.println(list2);


        //using copy
        List<String> list3 =new ArrayList<String>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        System.out.println(list3);

        //copying all elements of list 1 to list 3
        Collections.copy(list3, list1);
        System.out.println(list3);

    }
}