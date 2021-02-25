package collection.impl;

import collection.AdvancedList;
import collection.AuthorHolder;
import collection.SimpleList;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;

public class MyCollection<T> implements AdvancedList<T>, AuthorHolder {

    private static final String AUTHOR = "Gelnaz";

    private T[] container;
    private int numberItems;
    private int containerSize;

    public MyCollection() {
        containerSize = 10;
        container = (T[]) new Object[containerSize];
        numberItems = 0;
    }

    @Override
    public String author() {
        return AUTHOR;
    }


    @Override
    public void add(T item) {
        if(containerSize == numberItems){
            changingSize(container);
        }
        container[numberItems++] = item;
    }

    private void changingSize(T[] container){
        containerSize = (int)(containerSize * 1.5);
        T[] newContainer = (T[]) new Object[containerSize];
        for (int i = 0; i < numberItems; i++){
            newContainer[i] = container[i];
        }
        this.container = newContainer;
    }

    @Override
    public void insert(int index, T item) throws Exception {
        if (index > numberItems-1 || index < 0){
            throw new Exception("An element with this number does not exist");
        }

        for(int i = numberItems; i <= index; i--){
            if(containerSize == numberItems){
                changingSize(container);
            }
            container[i] = container[i-1];
        }
        container[index] = item;
    }

    @Override
    public void remove(int index) throws Exception {
        if (index > numberItems-1 || index < 0){
            throw new Exception("An element with this number does not exist");
        }
        for(int i = index; i < numberItems-1 ; i++){
            container[i] = container[i+1];
        }
        numberItems--;
    }

    @Override
    public Optional<T> get(int index) {
        if (index > numberItems-1 || index < 0){
            throw new RuntimeException("An element with this number does not exist");
        }
        return Optional.of(container[index]);
    }

    @Override
    public int size() {
        return numberItems;
    }

    @Override
    public void addAll(SimpleList<T> list) {
        for (int i = 0; i < list.size(); i++){
            if(containerSize == numberItems){
                changingSize(container);
            }
            container[numberItems++] = list.get(i).get();
        }
    }

    @Override
    public int first(T item) {
        for (int i = 0; i < numberItems; i++){
            if(item.equals(container[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int last(T item) {
        for (int i = numberItems - 1; i >=0; i--){
            if(item.equals(container[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T item) {
        for (int i = 0; i < numberItems; i++){
            if(item.equals(container[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = numberItems == 0 ? true : false;
        return isEmpty;
    }

    @Override
    public AdvancedList<T> shuffle() {
        AdvancedList<T> newContainer = new MyCollection<T>();

        return null;
    }

    @Override
    public AdvancedList<T> sort(Comparator<T> comparator) {
        return null;
    }

}
