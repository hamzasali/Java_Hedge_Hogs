package week_31;

import week_29.tree.MyNode;
import week_29.tree.MyTree;
import week_29.tree.VisualizeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RangeSumOfBst {

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(18);


        VisualizeTree.printTree(tree.root, null, false);

        System.out.println(inorderTraversal(tree.root, 7, 15));
        System.out.println(rangeSumBST(tree.root, 7, 15));


    }

    private static int sum;

    public static Integer inorderTraversal(MyNode root, int low, int high) {
        sum = 0;
        recursiveInOrderTraversal(root, low, high);

        return sum;
    }

//    public static void recursiveInOrderTraversal(MyNode root, int low, int high) {
//        if (root == null) {
//            return;
//        }
//
//        recursiveInOrderTraversal(root.leftChild, low, high);
//        if (low <= root.value && high >= root.value) {
//            sum += root.value;
//        }
//        recursiveInOrderTraversal(root.rightChild, low, high);
//    }

    public static void recursiveInOrderTraversal(MyNode root, int low, int high) {
        if (root == null) {
            return;
        }
        if (low <= root.value && high >= root.value) {
            sum += root.value;
        }

        if (root.value > low) {
            recursiveInOrderTraversal(root.leftChild, low, high);
        }
        if (root.value < high) {
            recursiveInOrderTraversal(root.rightChild, low, high);
        }


    }

    public static int rangeSumBST(MyNode root, int low, int high) {
        int ans = 0;

        Stack<MyNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            MyNode node = stack.pop();
            if (node != null) {
                if (low <= node.value && node.value <= high) {
                    ans += node.value;
                }
                if (node.value > low) {
                    stack.push(node.leftChild);
                }
                if (node.value < high) {
                    stack.push(node.rightChild);
                }
            }
        }
        return ans;
    }


}