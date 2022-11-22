package week_31;

import week_29.tree.MyNode;
import week_29.tree.MyTree;
import week_29.tree.VisualizeTree;

import java.util.ArrayDeque;


public class SameTree {

    public static void main(String[] args) {
        MyTree tree1 = new MyTree();
        tree1.insert(10);
        tree1.insert(5);
        tree1.insert(15);
        tree1.insert(3);
        tree1.insert(7);
        tree1.insert(18);
        MyTree tree2 = new MyTree();
        tree2.insert(10);
        tree2.insert(5);
        tree2.insert(15);
        tree2.insert(3);
        tree2.insert(7);
        tree2.insert(18);


        VisualizeTree.printTree(tree1.root, null, false);
        System.out.println("=======================================");
        System.out.println("=======================================");
        VisualizeTree.printTree(tree2.root, null, false);

        System.out.println(isSameTree(tree1.root, tree2.root));
        System.out.println(isSameTree2(tree1.root, tree2.root));


    }

    public static boolean isSameTree(MyNode p, MyNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.value != q.value) {
            return false;
        }

        return isSameTree(p.rightChild, q.rightChild)
                && isSameTree(p.leftChild, q.leftChild);
    }

    public static boolean check(MyNode p, MyNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.value != q.value) {
            return false;
        }

        return true;
    }

    public static boolean isSameTree2(MyNode p, MyNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (!check(p, q)) {
            return false;
        }

        ArrayDeque<MyNode> dequeP = new ArrayDeque<>();
        ArrayDeque<MyNode> dequeQ = new ArrayDeque<>();

        dequeP.addLast(p);
        dequeQ.addLast(q);

        while (!dequeP.isEmpty()) {
            p = dequeP.removeFirst();
            q = dequeQ.removeFirst();

            if (!check(p, q)) {
                return false;
            }
            if (p != null) {
                if (!check(p.leftChild, q.leftChild)) {
                    return false;
                }
                if (p.leftChild != null) {
                    dequeP.addLast(p.leftChild);
                    dequeQ.addLast(q.leftChild);
                }
                if (!check(p.rightChild, q.rightChild)) {
                    return false;
                }
                if (p.rightChild != null) {
                    dequeP.addLast(p.rightChild);
                    dequeQ.addLast(q.rightChild);
                }

            }
        }

        return true;

    }
}
