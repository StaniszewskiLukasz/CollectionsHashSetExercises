package pl.sda;

import java.util.HashSet;

//Write a Java program to clone a hash set to another hash set
public class Exercise3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Color");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        System.out.println(hashSet);
        HashSet<String> nextHashSet = new HashSet<String>();
        nextHashSet = (HashSet)hashSet.clone();
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println(nextHashSet);
    }
}
