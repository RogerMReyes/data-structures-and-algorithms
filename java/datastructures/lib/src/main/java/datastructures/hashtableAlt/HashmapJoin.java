package datastructures.hashtableAlt;

import datastructures.Node;
import datastructures.linkedlist.LinkedList;

import java.util.ArrayList;

public class HashmapJoin {

  public HashmapJoin() {
  }

  public void joinDirection(HashMap<String,String> hashMap1, HashMap<String,String> hashMap2, Boolean joinLeft){
    if(joinLeft){
      join(hashMap1, hashMap2);
    }
    else{
      join(hashMap2, hashMap1);
    }
  }

  public void join(HashMap<String,String> hashMap1, HashMap<String,String> hashMap2){
    ArrayList<HashMapPair<String, String>> newArray =  hashMap1.getPairs();
    for(HashMapPair<String, String> pair : newArray){
      hashMap1.add(pair.getKey(), hashMap2.get(pair.getKey()));
    }
  }
}
