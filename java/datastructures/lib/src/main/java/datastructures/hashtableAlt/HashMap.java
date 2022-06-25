package datastructures.hashtableAlt;

import datastructures.Node;
import datastructures.linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.Locale;

public class HashMap<K, V> {

  ArrayList<LinkedList<HashMapPair<K, V>>> buckets;
  int size;

  public HashMap(int size){
    if(size < 1){
      throw new IllegalArgumentException("Hashmap size must be greater than 1.");
    }

    this.size = size;
    this.buckets = new ArrayList<>(size);
    for(int i = 0; i < this.size; i++){
      buckets.add(i, new LinkedList<>());
    }
  }

  public void add(K key, V value){
    int index = hash(key);
    //TODO: value dupes exception
    buckets.get(index).append(new HashMapPair<>(key, value));
  }

  public V get (K key){
    int index = hash(key);
    Node<HashMapPair<K, V>> walker = buckets.get(index).head;
    while(walker != null){
      if(walker.value.getKey().equals(key)){
        return walker.value.getValue();
      }
      else {
        walker = walker.next;
      }
    }
    return null;
  }

  public boolean contains(K key){
    int index = hash(key);
    Node<HashMapPair<K, V>> walker = buckets.get(index).head;
    while(walker != null){
      if(walker.value.getKey().equals(key)){
        return true;
      }
      else {
        walker = walker.next;
      }
    }
    return false;
  }

  public ArrayList<HashMapPair<K, V>> getPairs(){
    ArrayList<HashMapPair<K, V>> newArray = new ArrayList<>();
    for(LinkedList<HashMapPair<K,V>> linkList : buckets){
      if(linkList.head != null){
        Node<HashMapPair<K, V>> walker = linkList.head;
        while(walker != null){
          newArray.add(walker.value);
          walker = walker.next;
        }
      }
    }
    return newArray;
  }

  public int hash(K key){
    return Math.abs(key.hashCode() % size);
  }

  public String repeatedWord(String text, HashMap<String, Integer> hashmap){
    String[] newArray = text.split("\\W+");
    for(int i = 0; i < newArray.length; i++){
      if(hashmap.contains(newArray[i])){
        return newArray[i];
      }
      else{
        hashmap.add(newArray[i].toLowerCase(),i);
      }
    }
    return "No Repeated Strings";
  }


  public ArrayList<LinkedList<HashMapPair<K, V>>> getBuckets() {
    return buckets;
  }

  public void setBuckets(ArrayList<LinkedList<HashMapPair<K, V>>> buckets) {
    this.buckets = buckets;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
