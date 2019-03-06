public class TreeSet<E extends Comparable<E>> {
    private Node<E> root;

    public TreeSet(E rootData) {
        this.root = new Node<>(rootData);
    }

    public Node<E> getRoot() {
        return this.root;
    }

    public void insert(E data) {
        // TODO: You implement this method
    }

    public void remove(E data) {
        // TODO: You implement this method
    }

    @Override
    public String toString() {
        // TODO: You implement this method
        return null;
    }
}
