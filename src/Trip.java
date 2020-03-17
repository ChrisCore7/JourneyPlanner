import java.util.ArrayList;
import java.util.List;

public class Trip {

    private List<Node> nodes;
    private List<Connection> edges;
    private String id;

    public Trip(String id){
        nodes = new ArrayList<Node>();
        this.id = id;
        this.nodes = nodes;


    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Connection> getEdges() {
        return edges;
    }

    /**
     * creating two edges from only creating an outgoing edge for a node
     * and then connecting the next node to the location of the outgoing node from the previous node.
     * if there is no Node in the list nodes. add the current node as the initial node.
     * @param node
     */
    public void createConnection(Node node){
        if(!nodes.isEmpty()){
            Node previousNode = nodes.get(nodes.size()-1);
            Connection connection = new Connection(this.id,node,previousNode);
            previousNode.addOutEdge(connection);
            node.addInEdge(connection);
        }
        nodes.add(node);
    }
}
