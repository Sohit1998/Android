package AssignThree;

import java.util.LinkedHashSet;

class OrderedSetFun extends LinkedHashSet<String> {
    @Override
    public boolean add(String element) {
        return super.add(element);
    }
}

public class OrderedSet {
    public static void main(String[] args) {
        OrderedSetFun orderedSet = new OrderedSetFun();

        orderedSet.add("A");
        orderedSet.add("B");
        orderedSet.add("B");
        orderedSet.add("D");

        System.out.println("Elements in the OrderedSet:");
        for (String element : orderedSet) {
            System.out.println(element);
        }
    }
}
