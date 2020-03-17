import java.util.List;

public class Node {
    /**
     * fields needed to create a node.
     */
    private String id;
    private String name;
    private double lon, lat;
    private Location location;
    private List<Connection> outEdges;
    private List<Connection> inEdges;

    /**
     * creates new node with id, name, latitude value, longitude value and gives the node location.
     */
    public Node(String id,String name, double lat, double lon ){
        this.id = id;
        this.name = name;
        this.lon = lon;
        this.lat = lat;
        location = Location.newFromLatLon(lat,lon);
    }

    public String getId() {
        return id; // returns the node id
    }

    public String getName() {
        return name; // returns bustop name for node.
    }

    public double getLon() {
        return lon; // returns longitude value for node
    }

    public double getLat() {
        return lat; // returns lat value for node
    }

    public Location getLocation() {
        return location; // returns location of node
    }

    public List<Connection> getOutEdges() {
        return outEdges; // returns outGoing connection to a node
    }

    public List<Connection> getInEdges() {
        return inEdges; // returns inGoing connection to a node
    }

    /**
     * add the outgoing connection to the current node.
     * @param connection
     */
    public void addOutEdge(Connection connection){
        outEdges.add(connection);
    }

    /**
     * add the connecting node to the next node
     * @param connection
     */
    public void addInEdge(Connection connection){
        inEdges.add(connection);
    }
}

