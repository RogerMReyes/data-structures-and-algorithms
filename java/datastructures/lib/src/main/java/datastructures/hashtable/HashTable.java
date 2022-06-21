package datastructures.hashtable;

import java.util.ArrayList;
import java.util.HashSet;

public class HashTable<K, V> {

  //Non-Scalable
  private ArrayList<V> buckets;
  // This way is susceptible to collision
  // TODO: replace/remove implementation
  HashSet<K> keyCollection = new HashSet<>();


  public HashTable(int size) {
    buckets = new ArrayList<>(size);
    for(int i = 0; i < size; i++){
      buckets.add(null);
    }
  }

  //hash() method on key then stores value at given index
  public void set(K key, V value){
    int index = hash(key);
    buckets.set(index, value);
    keyCollection.add(key);
  }

  //hash() method on key then retrieves value at given index
  public V get(K key){
    int index = hash(key);
    return buckets.get(index);
  }

  //hash() method on key then returns true if there is a value at returned index
  public boolean contains(K key){
    int index = hash(key);
    return buckets.get(index) != null;
  }

  //Takes a key and retrieves its unicode equivalent. Multiplies by prime and divedes by array list size to give index
  public int hash(K key){
    return key.hashCode() * 31 % 99;
  }

  public ArrayList<V> getBuckets() {
    return buckets;
  }

  public void setBuckets(ArrayList<V> buckets) {
    this.buckets = buckets;
  }

  public HashSet<K> getKeyCollection() {
    return keyCollection;
  }

  public void setKeyCollection(HashSet<K> keyCollection) {
    this.keyCollection = keyCollection;
  }
}
