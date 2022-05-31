package datastructures;

import org.junit.jupiter.api.Test;
import datastructures.queue.PseudoQueue;

import static org.junit.jupiter.api.Assertions.*;

public class PsuedoQueueTest {
  @Test
  void pseudoEnqueueReturnsCorrectInternalState() {
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueque(4);
    sut.enqueque(3);
    sut.enqueque(2);
    assertEquals("[2]->[3]->[4]->NULL",sut.toString());
  }

  @Test
  void pseudoDequeueReturns4() {
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueque(4);
    sut.enqueque(3);
    sut.enqueque(2);
    assertEquals(4,sut.dequeque());
  }
}
