package pl.sda;

import java.util.HashSet;

//Write a Java program to append the specified element to the end of a hash set.
public class Exercise1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Color");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        System.out.println(hashSet);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
