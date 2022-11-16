package week_30;

import week_29.tree.MyNode;
import week_29.tree.MyTree;
import week_29.tree.VisualizeTree;

public class CalculateSumNodeDepths {

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(9);
        tree.insert(1);

        VisualizeTree.printTree(tree.root, null, false);
        System.out.println("calculateSumNodeDepth(tree.root) = " + calculateSumNodeDepth(tree.root));

    }

    public static int calculateSumNodeDepth(MyNode root) {

        return nodeDepthSums(root, 0);
    }

    public static int nodeDepthSums(MyNode node, int sums) {
        if (node == null){
            return 0;
        }

        return sums +
                nodeDepthSums(node.leftChild, sums + 1)
                +
                nodeDepthSums(node.rightChild, sums + 1);
    }

}