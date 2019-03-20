package pl.sda;

import java.util.HashSet;
//Write a Java program to get the number of elements in a hash set and clear a hashSet and test a hashSet is empty
public class Exercise2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Color");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        hashSet.clear();
        System.out.println(hashSet.isEmpty());
    }
}
