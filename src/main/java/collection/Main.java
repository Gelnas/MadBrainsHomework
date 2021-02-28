package collection;

import collection.impl.MyCollection;

public class Main {
    public static void main(String[] args) throws Exception {
        MyCollection<Integer> intCollection = new MyCollection<>();
        System.out.println("Size before add something " + intCollection.size());
        intCollection.add(13);
        intCollection.add(15);
        intCollection.add(17);
        intCollection.add(19);
        intCollection.add(16);
        intCollection.add(15);
        MyCollection<Integer> forAdd = new MyCollection<>();
        forAdd.add(1);
        forAdd.add(2);
        forAdd.add(3);
        forAdd.add(15);
        forAdd.add(5);
        intCollection.addAll(forAdd);
        System.out.println("Size after add something " +intCollection.size());
        System.out.println("intCollection");
        intCollection.print();
        intCollection.insert(5, 89);
        System.out.println("Element number 5 = " + intCollection.get(5).get());
        intCollection.remove(7);
        System.out.println("intCollection after remove and insert");
        intCollection.print();
        System.out.println("the first occurrence of a number 15 in intCollection " + intCollection.first(15));
        System.out.println("the last occurrence of a number 15 in intCollection " + intCollection.last(15));
        System.out.println("contains 15? " + intCollection.contains(15));
        System.out.println("isEmpty? " + intCollection.isEmpty());

        MyCollection<Integer> newCollection = (MyCollection<Integer>) intCollection.shuffle();
        System.out.println("shuffle");
        newCollection.print();

        intCollection.print();

        MyCollection<Integer> toSort = (MyCollection<Integer>) intCollection.sort(Integer::compareTo);

        toSort.print();
        intCollection.print();

        MyCollection<String> strCollection = new MyCollection<>();
        strCollection.add("qwerty");
        strCollection.add("abc");
        strCollection.add("dfg");
        strCollection.add("ty764@");

        MyCollection<String> newStrCollection = (MyCollection<String>) strCollection.sort(String::compareTo);
        newStrCollection.print();
        strCollection.print();

        MyCollection<Test> testMyCollection = new MyCollection<>();
        testMyCollection.add(new Test(3, "Tim", 26));
        testMyCollection.add(new Test(1, "Iren", 26));
        testMyCollection.add(new Test(2, "Rick", 150));
        testMyCollection.add(new Test(4, "Morty", 13));

        System.out.println("Source collection");
        testMyCollection.print();

        MyCollection<Test> sortByNumberTestMyCollection = (MyCollection<Test>) testMyCollection.sort(Test::compareTo);

        System.out.println("Collection sorted by number");
        sortByNumberTestMyCollection.print();

        AgeComparator ageComparator = new AgeComparator();
        MyCollection<Test> sortByAgeTestMyCollection = (MyCollection<Test>) testMyCollection.sort(ageComparator);

        System.out.println("Collection sorted by age");
        sortByAgeTestMyCollection.print();

        MyCollection<Test> shuffleTestMyCollection = (MyCollection<Test>) testMyCollection.shuffle();

        System.out.println("Mixed collection");
        shuffleTestMyCollection.print();

        System.out.println("Source collection");
        testMyCollection.print();
    }
}
