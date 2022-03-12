import java.util.*;


public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();//declaration of Array List
        //add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);


        //get elements
        int element = list.get(0);
        System.out.println(element);

        //add elements in between
        list.add(1,2);//added 2 as element in the first index
        System.out.println(list);

        //set element
        list.set(0, 10);
        System.out.println(list);

        //delete elements
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));  
        }

        //sorting -ascending
        Collections.sort(list);
        System.out.println(list);


    }
    
}
