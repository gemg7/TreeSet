public class test {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);

        System.out.println(tree.getRoot());
        System.out.println(tree.getRoot().getLeft());
        System.out.println(tree.getRoot().getRight());
        System.out.println(tree.getRoot().getLeft().getLeft());
        System.out.println(tree.getRoot().getLeft().getRight());
    }
}
