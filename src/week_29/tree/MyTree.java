package week_29.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    MyNode root;

    void insert(int value) {
        MyNode node = new MyNode(value);

        if (root == null) {
            root = node;
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

    void levelOrderTraversal() {
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

    void postOrder(MyNode root) {
        if (root == null) return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.value + " ");
    }

}
