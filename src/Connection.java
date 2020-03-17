public class Connection {

    private String tripId;
    private Node toNode;
    private Node fromNode;

    public Connection(String tripId, Node toNode,Node fromNode){
        tripId = this.tripId;
        toNode = this.toNode;
        fromNode = this.fromNode;
    }

    public String getTripId() {
        return tripId;
    }

    public Node getToNode() {
        return toNode;
    }

    public Node getFromNode() {
        return fromNode;
    }
}
