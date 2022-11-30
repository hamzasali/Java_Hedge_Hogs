package week_31.session;

import week_29.tree.MyNode;
import week_29.tree.MyTree;
import week_29.tree.VisualizeTree;

public class SameTreeSession {

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
//        tree2.insert(18);


        VisualizeTree.printTree(tree1.root, null, false);
        System.out.println("=======================================");
        System.out.println("=======================================");
        VisualizeTree.printTree(tree2.root, null, false);

        System.out.println(sameTree(tree1.root, tree2.root));

    }


    public static boolean sameTree(MyNode p, MyNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.value != q.value) {
            return false;
        }

        return sameTree(p.leftChild, q.leftChild) && sameTree(p.rightChild, q.rightChild);
    }
}
