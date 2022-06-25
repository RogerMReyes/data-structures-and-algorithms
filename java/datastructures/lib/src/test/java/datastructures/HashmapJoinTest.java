package datastructures;

import datastructures.hashtableAlt.HashMap;
import datastructures.hashtableAlt.HashMapPair;
import datastructures.hashtableAlt.HashmapJoin;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HashmapJoinTest {

  HashMap<String, String> hashMap1 = new HashMap<>(5);
  HashMap<String, String> hashMap2 = new HashMap<>(5);


  @Test
  void joinReturnsJoinedHashMapLeft() {
    hashMap1.add("diligent", "employed");
    hashMap1.add("fond", "enamored");
    hashMap1.add("guide", "usher");
    hashMap1.add("outfit", "garb");
    hashMap1.add("wrath", "anger");
    hashMap2.add("diligent", "idle");
    hashMap2.add("fond", "averse");
    hashMap2.add("guide", "follow");
    hashMap2.add("flow", "jam");
    hashMap2.add("wrath", "delight");
    HashmapJoin join = new HashmapJoin();
    join.joinDirection(hashMap1,hashMap2,true);
    ArrayList<HashMapPair<String, String>> list = hashMap1.getPairs();
    HashMapPair<String,String> check = new HashMapPair<>("outfit",null);
    assertTrue(list.contains(check));
  }

  @Test
  void joinReturnsJoinedHashMapRight() {
    hashMap1.add("diligent", "employed");
    hashMap1.add("fond", "enamored");
    hashMap2.add("diligent", "idle");
    hashMap2.add("guide", "follow");
    HashmapJoin join = new HashmapJoin();
    join.joinDirection(hashMap1,hashMap2,false);
    ArrayList<HashMapPair<String, String>> list = hashMap2.getPairs();
    HashMapPair<String,String> check = new HashMapPair<>("guide",null);
    assertTrue(list.contains(check));
  }
}
