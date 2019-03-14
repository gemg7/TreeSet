import java.util.Stack;

public class TreeSet<E extends Comparable<E>> {
    private Node<E> root;
    private static StringBuilder str = new StringBuilder();

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
            if(node.getLeft() == null && node.getRight() != null) {
                node = node.getRight();
            } else if(node.getRight() == null && node.getLeft() != null) {
                node = node.getLeft();
            } else if(node.getRight() != null && node.getLeft() != null) {
                Node<E> minimum = getMinValue(node);
                remove(minimum.getData());
                node.setData(minimum.getData());
            } else {
                node = null;
            }
        } else {
            if(node.getData().compareTo(data.getData()) > 0) {
                removeHelper(node.getLeft(), data);
            } else {
                removeHelper(node.getRight(), data);
            }
        }
    }

    public Node<E> getMinValue(Node<E> node) {
        Node<E> current = node;
        while(current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }

    @Override
    public String toString() {
        if (this.root == null) {
            return null;
        }
        str.append("[");
        toString(this.root);
        str.replace(str.length() - 2, str.length(), "");
        str.append("]");
        return str.toString();
    }

    private void toString(Node<E> node) {
        if (node == null) {
            return;
        }
        toString(node.getLeft());
        str.append(node);
        str.append(", ");
        toString(node.getRight());
    }
}

