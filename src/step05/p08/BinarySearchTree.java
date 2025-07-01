package step05.p08;

public class BinarySearchTree {
    private Node root;

    public void insert(EnvironmentInfo data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node node, EnvironmentInfo data) {
        if (node == null) return new Node(data);

        int cmp = data.getDate().compareTo(node.getInfo().getDate());
        if (cmp < 0) node.setLeft(insertRec(node.getLeft(), data));
        else if (cmp > 0) node.setRight(insertRec(node.getRight(), data));
        return node;
    }

    public Node search(String date) {
        return searchRec(root, date);
    }

    private Node searchRec(Node node, String date) {
        if (node == null) return null;

        int cmp = date.compareTo(node.getInfo().getDate());
        if (cmp == 0) return node;
        else if (cmp < 0) return searchRec(node.getLeft(), date);
        else return searchRec(node.getRight(), date);
    }

    public void writeInOrder(StringBuilder builder) {
        writeRec(root, builder);
    }

    private void writeRec(Node node, StringBuilder builder) {
        if (node == null) return;
        writeRec(node.getLeft(), builder);
        builder.append(node.getInfo().toLine()).append("\n");
        writeRec(node.getRight(), builder);
    }
}
