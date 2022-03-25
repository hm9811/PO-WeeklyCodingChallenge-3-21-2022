import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        list1.add(3);
        list1.add(7);
        list1.add(8);
        list1.add(12);

        list2.add(99);
        list2.add(1);
        list2.add(8);
        list2.add(10);


        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if(list1.get(i).equals(list2.get(j))) {
                    System.out.println(list2.get(j));
                    break;
                }
            }
        }


    }

}
