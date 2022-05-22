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
        String e1, e2;
        e1=scanner.next();
        e2= scanner.next();
        if(list.contains(e1)==true && list.contains(e2)==true)
        {
             System.out.println("Before swapping");
            System.out.println(list);
            int index1=0, index2=0;
            index1= list.indexOf(e1);
            index2= list.indexOf(e2);
            list.set(index1, e2);
            list.set(index2, e1);
             System.out.println("After swapping");
            System.out.println(list);
        }
        else
        {
            System.out.print("One or both elements are not present");

        }
    }
}