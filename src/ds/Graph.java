package ds;

import java.util.Set;

public interface Graph {
    Set<Vertex> getAdjElements(Vertex vertex);
    boolean isValidEdge(Vertex first, Vertex second);
    Edge getEdge(Vertex first, Vertex second);
    boolean isUnidirectional();
}
