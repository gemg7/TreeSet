public class test {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.remove(2);

        System.out.println(tree);
    }
}
