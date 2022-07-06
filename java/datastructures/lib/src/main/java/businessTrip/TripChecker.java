package businessTrip;

import datastructures.graph.Edge;
import datastructures.graph.Graph;
import datastructures.graph.Vertex;
import datastructures.queue.Queue;

import java.util.HashSet;
import java.util.List;

public class TripChecker {

  public String businessTrip(Graph<String> graph, List<Vertex<String>> cities){
    Queue<Vertex<String>> newQueue = new Queue<>();
    HashSet<Vertex<String>> visited = new HashSet<>();
    int stops = 1;
    int price = 0;
    if(graph.getAdjVertices().containsKey(cities.get(0))){
      newQueue.enqueue(cities.get(0));
      visited.add(cities.get(0));
    }
    while(!newQueue.isEmpty() && stops != cities.size()){
      Vertex<String> vertex = newQueue.dequeue();

      for(Edge<String> edge : graph.getNeighbors(vertex)){
        if(!visited.contains(edge.getVertex())){
          if(edge.getVertex().equals(cities.get(stops))) {
            newQueue.enqueue(edge.getVertex());
            visited.add(edge.getVertex());
          }
        }
        if(edge.getVertex() == cities.get(stops)){
          price += edge.getWeight();
          stops++;
        }
      }
    }

    if(stops == cities.size()){
      return "$" + price;
    }
    else {
      return null;
    }
  }
}
