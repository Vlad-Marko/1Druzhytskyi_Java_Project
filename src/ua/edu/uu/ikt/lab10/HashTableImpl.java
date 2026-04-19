package ua.edu.uu.ikt.lab10;

import ua.edu.uu.ikt.lab5.LinkedList;

public class HashTableImpl implements HashTable {

    private LinkedList[] container;
    private int numberOfBuckets;


    public HashTableImpl(int numberOfBuckets) {

        this.numberOfBuckets = numberOfBuckets;
        container = new LinkedList[numberOfBuckets];
        for (int i = 0; i < numberOfBuckets; i++) {
            container[i] = new LinkedList();
        }

    }

    public int getBucketNumber(int data) {
        return data % numberOfBuckets;
    }



    @Override
    public void put(int data) {
        int bucketNumber = getBucketNumber(data);
        container[bucketNumber].add(data);

    }

    @Override
    public int get(int data) {
        int bucketNumber = getBucketNumber(data);
        return container[bucketNumber].find(data).getData();

    }

    @Override
    public int remove(int data) {
        int bucketNumber = getBucketNumber(data);
        return container[bucketNumber].remove(data).getData();

    }

    @Override
    public boolean containsKey(int data) {
        int bucketNumber = getBucketNumber(data);
        return container[bucketNumber].find(data) != null;

    }

    @Override
    public void display() {
        for (int i = 0; i < numberOfBuckets; i++) {
            System.out.print("bucket number = " + i + " data: ");
            container[i].display();

        }
    }
}
