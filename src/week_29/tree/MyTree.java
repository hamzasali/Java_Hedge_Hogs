package week_29.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public MyNode root;

    public void insert(int value) {
        MyNode node = new MyNode(value);

        if (root == null) {
            root = node;
            return;
        }
        MyNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            MyNode toVisit = queue.poll();
            System.out.print(toVisit.value + " ");
            if (toVisit.rightChild != null) {
                queue.add(toVisit.rightChild);
            }
            if (toVisit.leftChild != null) {
                queue.add(toVisit.leftChild);
            }
        }
    }

    public void postOrder(MyNode root) {
        if (root == null) return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.value + " ");

    }

    public void preOrder(MyNode root) {
        if (root == null) return;
        System.out.println(root.value + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);

    }

    public void inOrder(MyNode root) {
        if (root == null) return;
        inOrder(root.leftChild);
        System.out.println(root.value + " ");
        inOrder(root.rightChild);

    }

    public boolean contains(int value) {
        if (root == null) return false;

        MyNode current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean isLeaf(MyNode node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public void printLeaves(MyNode root) {
        if (root == null) {
            return;
        }
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
        if (isLeaf(root)) {
            System.out.print(root.value + " ");
        }
    }

    public int countLeaves(MyNode root) {
        if (root == null) {
            return 0;
        }
        if (isLeaf(root)) {
            return 1;
        }
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

    public int findSumOfLeaves(MyNode root) {
        if (root == null) {
            return 0;
        }
        if (isLeaf(root)) {
            return root.value;
        }
        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }

    public int height(MyNode root) {
        if (root == null) {
            return -1;
        }
        if (isLeaf(root)) {
            return 0;
        }
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

}
