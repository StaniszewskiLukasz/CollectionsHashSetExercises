package pl.sda;

import java.util.HashSet;
//Write a Java program to compare two sets and retain elements which are same on both sets
public class Exercise5 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Color");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        System.out.println(hashSet);
        HashSet<String> nextHashSet = new HashSet<String>();
        nextHashSet.add("Coś");
        nextHashSet.add("Ktoś");
        nextHashSet.add("Łoś");
        nextHashSet.add("Pink");
        System.out.println(nextHashSet);
        nextHashSet.retainAll(hashSet);
        System.out.println(nextHashSet);


    }
}
