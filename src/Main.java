public class Main {
    public static void main(String[] args) {
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(15);
        node.appendToEnd(6);
        node.appendToEnd(11);
        node.appendToEnd(7);
        node.appendToEnd(8);

        node.printNodes();
        node.sumOfNodes();
        node.length(node);
        node.deleteNode(node,6);
    }
}
