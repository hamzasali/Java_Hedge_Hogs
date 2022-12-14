package hamzaAli.tree;

import week_29.tree.MyNode;
import week_29.tree.VisualizeTree;

public class MyTree {
    public static void main(String[] args) {
        week_29.tree.MyTree tree1 = new week_29.tree.MyTree();
        tree1.insert(10);
        tree1.insert(5);
        tree1.insert(15);
        tree1.insert(3);
        tree1.insert(7);
        tree1.insert(18);
        week_29.tree.MyTree tree2 = new week_29.tree.MyTree();
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
    }

    public static boolean isSameTree(MyNode p, MyNode q) {
        if (p.value == q.value) {
            return true;
        }
        return isSameTree(p.leftChild, q.leftChild)
                && isSameTree(p.rightChild, q.rightChild);
    }
}