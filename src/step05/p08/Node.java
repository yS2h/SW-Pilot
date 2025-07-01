package step05.p08;

public class Node {
    private EnvironmentInfo info;
    private Node left;
    private Node right;

    public Node(EnvironmentInfo info) {
        this.info = info;
    }

    public EnvironmentInfo getInfo() {
        return info;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
