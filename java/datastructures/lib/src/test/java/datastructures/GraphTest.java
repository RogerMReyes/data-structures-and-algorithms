package datastructures;

import datastructures.graph.Graph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

  @Test
  void addNodeAndGetNodeTest() {
    Graph<String> sut = new Graph<>();
    assertEquals("Alpha", sut.addNode("Alpha").getValue());
    assertFalse(sut.getAdjVertices().isEmpty());
    assertEquals(1,sut.getNodes().size());
  }


}
