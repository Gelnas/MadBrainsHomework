package collection.impl;

import collection.AdvancedList;
import collection.AuthorHolder;
import collection.SimpleList;

import java.util.Comparator;
import java.util.Optional;

public class MyCollection<T> implements AdvancedList<T>, AuthorHolder {

    private static final String AUTHOR = "Gelnaz";

    public MyCollection() {
    }

    @Override
    public String author() {
        return AUTHOR;
    }


    @Override
    public void add(T item) {

    }

    @Override
    public void insert(int index, T item) throws Exception {

    }

    @Override
    public void remove(int index) throws Exception {

    }

    @Override
    public Optional<T> get(int index) {
        return Optional.empty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addAll(SimpleList<T> list) {

    }

    @Override
    public int first(T item) {
        return 0;
    }

    @Override
    public int last(T item) {
        return 0;
    }

    @Override
    public boolean contains(T item) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public AdvancedList<T> shuffle() {
        return null;
    }

    @Override
    public AdvancedList<T> sort(Comparator<T> comparator) {
        return null;
    }

}
