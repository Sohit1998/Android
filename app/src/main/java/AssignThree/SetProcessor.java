package AssignThree;

import java.util.TreeSet;

abstract class AbstractSetProcessor {
    abstract void processSet(TreeSet<String> set);
}

class UpperCaseSetProcessor extends AbstractSetProcessor {
    @Override
    void processSet(TreeSet<String> set) {
        TreeSet<String> upperCaseSet = new TreeSet<>();
        for (String element : set) {
            upperCaseSet.add(element.toUpperCase());
        }
        System.out.println("Set after converting elements to Uppercase: " + upperCaseSet);
    }
}

class LowerCaseSetProcessor extends AbstractSetProcessor {
    @Override
    void processSet(TreeSet<String> set) {
        TreeSet<String> lowerCaseSet = new TreeSet<>();
        for (String element : set) {
            lowerCaseSet.add(element.toLowerCase());
        }
        System.out.println("Set after converting elements to Lowercase: " + lowerCaseSet);
    }
}

public class SetProcessor {
    public static void main(String[] args) {
        TreeSet<String> inputSet = new TreeSet<>();
        inputSet.add("ketan");
        inputSet.add("jasmin");
        inputSet.add("SapNA");
        inputSet.add("PanKaj");

        AbstractSetProcessor upperCaseProcessor = new UpperCaseSetProcessor();
        upperCaseProcessor.processSet(inputSet);

        AbstractSetProcessor lowerCaseProcessor = new LowerCaseSetProcessor();
        lowerCaseProcessor.processSet(inputSet);
    }
}
