package datastructures;

import businessTrip.TripChecker;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

  @Test
  void addNodeAndGetNodeTest() {
    Graph<String> sut = new Graph<>();
    assertEquals("Alpha", sut.addNode("Alpha").getValue());
    assertFalse(sut.getAdjVertices().isEmpty());
    assertEquals(1,sut.getNodes().size());
  }

  @Test
  void businessTripTest1() {
    Graph<String> graph = new Graph<>();
    Vertex<String> temp1 = graph.addNode("Pandora");
    Vertex<String> temp2 = graph.addNode("Arendelle");
    Vertex<String> temp3 = graph.addNode("Metroville");
    Vertex<String> temp4 = graph.addNode("Narnia");
    Vertex<String> temp5 = graph.addNode("Monstropolis");
    Vertex<String> temp6 = graph.addNode("Naboo");
    graph.addEdgeWeightedBiDi(temp1,temp2,150);
    graph.addEdgeWeightedBiDi(temp1,temp3,82);
    graph.addEdgeWeightedBiDi(temp2,temp3,99);
    graph.addEdgeWeightedBiDi(temp2,temp5,42);
    graph.addEdgeWeightedBiDi(temp3,temp5,105);
    graph.addEdgeWeightedBiDi(temp3,temp6,26);
    graph.addEdgeWeightedBiDi(temp3,temp4,37);
    graph.addEdgeWeightedBiDi(temp4,temp6,250);
    graph.addEdgeWeightedBiDi(temp5,temp6,73);
    ArrayList<Vertex<String>> arrayList = new ArrayList<>();
    arrayList.add(temp1);
    arrayList.add(temp3);

    TripChecker sut = new TripChecker();
    assertEquals("$82", sut.businessTrip(graph,arrayList));
  }

  @Test
  void businessTripTest2() {
    Graph<String> graph = new Graph<>();
    Vertex<String> temp1 = graph.addNode("Pandora");
    Vertex<String> temp2 = graph.addNode("Arendelle");
    Vertex<String> temp3 = graph.addNode("Metroville");
    Vertex<String> temp4 = graph.addNode("Narnia");
    Vertex<String> temp5 = graph.addNode("Monstropolis");
    Vertex<String> temp6 = graph.addNode("Naboo");
    graph.addEdgeWeightedBiDi(temp1,temp2,150);
    graph.addEdgeWeightedBiDi(temp1,temp3,82);
    graph.addEdgeWeightedBiDi(temp2,temp3,99);
    graph.addEdgeWeightedBiDi(temp2,temp5,42);
    graph.addEdgeWeightedBiDi(temp3,temp5,105);
    graph.addEdgeWeightedBiDi(temp3,temp6,26);
    graph.addEdgeWeightedBiDi(temp3,temp4,37);
    graph.addEdgeWeightedBiDi(temp4,temp6,250);
    graph.addEdgeWeightedBiDi(temp5,temp6,73);
    ArrayList<Vertex<String>> arrayList = new ArrayList<>();
    arrayList.add(temp2);
    arrayList.add(temp5);
    arrayList.add(temp6);

    TripChecker sut = new TripChecker();
    assertEquals("$115", sut.businessTrip(graph,arrayList));
  }

  @Test
  void businessTripTest3() {
    Graph<String> graph = new Graph<>();
    Vertex<String> temp1 = graph.addNode("Pandora");
    Vertex<String> temp2 = graph.addNode("Arendelle");
    Vertex<String> temp3 = graph.addNode("Metroville");
    Vertex<String> temp4 = graph.addNode("Narnia");
    Vertex<String> temp5 = graph.addNode("Monstropolis");
    Vertex<String> temp6 = graph.addNode("Naboo");
    graph.addEdgeWeightedBiDi(temp1,temp2,150);
    graph.addEdgeWeightedBiDi(temp1,temp3,82);
    graph.addEdgeWeightedBiDi(temp2,temp3,99);
    graph.addEdgeWeightedBiDi(temp2,temp5,42);
    graph.addEdgeWeightedBiDi(temp3,temp5,105);
    graph.addEdgeWeightedBiDi(temp3,temp6,26);
    graph.addEdgeWeightedBiDi(temp3,temp4,37);
    graph.addEdgeWeightedBiDi(temp4,temp6,250);
    graph.addEdgeWeightedBiDi(temp5,temp6,73);
    ArrayList<Vertex<String>> arrayList = new ArrayList<>();
    arrayList.add(temp6);
    arrayList.add(temp1);

    TripChecker sut = new TripChecker();
    assertNull( sut.businessTrip(graph,arrayList));
  }
}
