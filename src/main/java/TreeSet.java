public class TreeSet<E extends Comparable<E>> {
    private Node<E> root;

    public TreeSet(E rootData) {
        this.root = new Node<>(rootData);
    }

    public Node<E> getRoot() {
        return this.root;
    }

    public void insert(E data) {
        if(root == null) {
            root = new Node<>(data);
        }
        Node<E> current = root;
        Node<E> dataNode = new Node<>(data);
        insertHelper(current, dataNode);
    }

    public void insertHelper(Node<E> node, Node<E> data) {

        if(node.getLeft() == null) {
            if (data.getData().compareTo(node.getData()) < 0) {
                node.addLeft(data);
            } else {
                insertHelper(node.getRight(), data);
            }
        } else if(node.getRight() == null) {
            if(data.getData().compareTo(node.getData()) > 0) {
                node.addRight(data);
            } else {
                insertHelper(node.getLeft(), data);
            }
        } else {
            if(data.getData().compareTo(node.getData()) < 0) {
                insertHelper(node.getLeft(), data);
            } else {
                insertHelper(node.getRight(), data);
            }
        }
    }

    public void remove(E data) {
        Node<E> current = root;
        Node<E> dataNode = new Node<E>(data);
        removeHelper(current, dataNode);
    }

    public void removeHelper(Node<E> node, Node<E> data) {
        if(node == null) {
            return;
        }
        if(node.getData().compareTo(data.getData()) == 0) {

        }
    }

//    public Node<E> getMinValue(Node<E> node) {
//
//    }

    @Override
    public String toString() {
        // TODO: You implement this method
        return null;
    }
}
