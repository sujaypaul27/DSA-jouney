/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    private Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // already cloned
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // create new node
        Node clone = new Node(node.val);
        map.put(node, clone);

        // clone neighbors
        for (Node nei : node.neighbors) {
            clone.neighbors.add(cloneGraph(nei));// Recursively clone the neighbors and add them to the clone's neighbors list
        }

        return clone;// Return the cloned node, which is the entry point to the cloned graph
    }
}// Time complexity: O(N + M), where N is the number of nodes and M is the number of edges in the graph. This is because we visit each node and edge once during the cloning process. The space complexity is O(N) for the map that stores the cloned nodes, and O(N) for the recursion stack in the worst case (if the graph is a linear chain).