public class myBThree<E extends Comparable<E>> implements myThree<E> {

    private Node root;

    public myBThree(E root) {
        this.root = new Node(root);
    }


    @Override
    public void add(E value) {
        root = addRecursive(root, value);
    }

    public boolean containsNode(E value) {
        return containsNodeRecursive(root, value);
    }

    public void delete(E value) {
        root = deleteRecursive(root, value);
    }

    private Node addRecursive(Node current, E value) {
        if (current == null) {
            return new Node(value);
        }

        if (value.compareTo((E) current.value) < 0) {
            current.left = addRecursive(current.left, value);
        } else if (value.compareTo((E) current.value) > 0) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNodeRecursive(Node current, E value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        if (value.compareTo((E) current.value) < 0) {
            return containsNodeRecursive(current.left, value);
        } else {
            return containsNodeRecursive(current.right, value);
        }
    }

    private Node deleteRecursive(Node current, E value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {

            if (current.left == null && current.right == null) {
                return null;
            }


            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
        }
        if (value.compareTo((E) current.value) < 0) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    class Node<E> implements Comparable<E> {
        E value;
        Node left;
        Node right;

        Node(E value) {
            this.value = value;
            right = null;
            left = null;
        }

        @Override
        public int compareTo(E o) {
            String temp1 = this.value.toString();
            String temp2 = o.toString();
            return temp1.compareTo(temp2);
        }
    }


}
