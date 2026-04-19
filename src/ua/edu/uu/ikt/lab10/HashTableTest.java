package ua.edu.uu.ikt.lab10;

public class HashTableTest {

    static void main() {
        HashTable hashTable = new HashTableImpl(5);

        hashTable.put(1);
        hashTable.put(4);
        hashTable.put(15);
        hashTable.put(23);
        hashTable.put(32);
        System.out.println("added first group of values:");
        hashTable.display();
        System.out.println("hash table contains 24: " + hashTable.containsKey(24));
        System.out.println("hash table contains 23: " + hashTable.containsKey(23));
        System.out.println("hash table contains 1: " + hashTable.containsKey(1));

        hashTable.put(36);
        hashTable.put(21);
        hashTable.put(61);
        System.out.println("added second group of values:");
        hashTable.display();

        hashTable.remove(21);
        hashTable.remove(1);

        System.out.println("after remove of 21 and 1:");
        hashTable.display();
    }

    }
