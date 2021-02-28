package collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Test> {

    @Override
    public int compare(Test o1, Test o2) {
        return o1.getAge() > o2.getAge() ? 1 : (o1.getAge() == o2.getAge() ? 0 : -1);
    }
}
