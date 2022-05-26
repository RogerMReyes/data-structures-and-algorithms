/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package datastructures;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {
    @Test void someLibraryMethodReturnsTrue() {
      Library classUnderTest = new Library();
      assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void includesReturnsNodeValue(){
      LinkedList<Integer> newList = new LinkedList<>();
      for(int i = 1; i <= 5; i++){
        newList.insert(i);
      }
      assertTrue(newList.includes(5));
    }

    @Test void toStringReturnsString(){
      Node<Integer> newNode = new Node<>(5);
      LinkedList<Integer> newList = new LinkedList<>();
      newList.insert(8);
      newList.insert(4);
      assertEquals(newList.toString(), "[4]->[8]->NULL");
    }

  @Test
  void appendReturnsUpdatedList() {
    LinkedList<Integer> newList = new LinkedList<>();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);
    newList.append(5);
    assertEquals("[3]->[2]->[1]->[5]->NULL", newList.toString());
  }

  @Test
  void insertBeforeReturnsUpdatedList() {
    LinkedList<Integer> newList = new LinkedList<>();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);
    newList.insertBefore(3,1);
    assertEquals("[3]->[2]->[3]->[1]->NULL", newList.toString());
  }

  @Test
  void insertAfterReturnsUpdatedList() {
    LinkedList<Integer> newList = new LinkedList<>();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);
    newList.insertAfter(3,2);
    assertEquals("[3]->[2]->[3]->[1]->NULL", newList.toString());
  }

  @Test
  void testing() {
    LinkedList<Integer> newList = new LinkedList<>();
    newList.insert(1);
    newList.insert(2);
    newList.insert(3);
    newList.insertAfter(5,1);
    newList.insertBefore(7,5);
    newList.append(9);
//    System.out.println(newList.toString());
  }

  @Test
  void kthFromEndReturnsSecondValueFromTail() {
    LinkedList<Integer> newList = new LinkedList<>();
    newList.insert(2);
    newList.insert(8);
    newList.insert(3);
    newList.insert(1);
//    System.out.println(newList.toString() + " " + newList.kthFromEnd(2));
  }

  @Test
  void kthFromEndReturnsNullForEdgeCases() {
    LinkedList<Integer> newList = new LinkedList<>();
    assertEquals(null, newList.kthFromEnd(4));
    newList.insert(1);
    assertEquals(null, newList.kthFromEnd(1));
    newList.insert(2);
    assertEquals(null, newList.kthFromEnd(2));
    assertEquals(null, newList.kthFromEnd(-3));
  }

  @Test
  void zipListsReturnsZippedList() {
      LinkedList<Integer> list1 = new LinkedList<>();
      LinkedList<Integer> list2 = new LinkedList<>();
      list1.insert(2);
    list1.insert(3);
    list1.insert(1);
    list2.insert(4);
    list2.insert(9);
    list2.insert(5);
    System.out.println(list1.zipLists(list2).toString());
  }
}
