package AssignThree;

import java.util.LinkedList;

abstract class AbstractListProcessor {
    abstract void processList(LinkedList<Integer> list);
}

class SumListProcessor extends AbstractListProcessor {
    @Override
    void processList(LinkedList<Integer> list) {
        int sum = 0;
        for (int element : list) {
            sum += element;
        }
        System.out.println("Sum of the elements in the list: " + sum);
    }
}

class ProductListProcessor extends AbstractListProcessor {
    @Override
    void processList(LinkedList<Integer> list) {
        int product = 1;
        for (int element : list) {
            product *= element;
        }
        System.out.println("Product of the elements in the list: " + product);
    }
}

public class ListProcessor {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);

        AbstractListProcessor sumListProcessor = new SumListProcessor();
        sumListProcessor.processList(integerList);

        AbstractListProcessor productListProcessor = new ProductListProcessor();
        productListProcessor.processList(integerList);
    }
}