package collection;

import java.util.Objects;

public class Test implements Comparable<Test>{
    private int number;
    private String name;
    private int age;

    public Test(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return number == test.number && name.equals(test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public int compareTo(Test o) {
        return this.number - o.number;
    }

    @Override
    public String toString() {
        return number + " " + name + " " + age;
    }
}
