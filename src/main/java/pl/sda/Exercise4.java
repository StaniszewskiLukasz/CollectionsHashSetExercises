package pl.sda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
//Write a Java program to convert a hash set to a List/ArrayList
//Write a Java program to convert a hash set to a tree set.
public class Exercise4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Color");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        System.out.println(hashSet);
        TreeSet<String> treeSet = new TreeSet<String>(hashSet);
        System.out.println(treeSet);
        List<String> strings = new ArrayList<String>(hashSet);
        System.out.println(strings);
    }
}
