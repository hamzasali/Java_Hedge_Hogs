package week_31.session;

import week_29.tree.MyNode;
import week_29.tree.MyTree;
import week_29.tree.VisualizeTree;

import java.util.Stack;

public class RangeSumOfBSTSession {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(18);


        VisualizeTree.printTree(tree.root, null, false);

//        System.out.println(rangeSumBST(tree.root, 7, 15));
        System.out.println(rangeSumBST1(tree.root, 7, 15));

    }

    private static int sum = 0;

    public static int rangeSumBST(MyNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        rangeSumBST(root.leftChild, low, high);
        if (root.value >= low && root.value <= high) {
            sum += root.value;
        }
        rangeSumBST(root.rightChild, low, high);
        return sum;
    }

    public static int rangeSumBST1(MyNode root, int low, int high) {

        int result = 0;

        Stack<MyNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            MyNode current = stack.pop();

            if (current != null) {

                if (current.value >= low && current.value <= high) {
                    result += current.value;
                }
                if (current.value > low) {
                    stack.push(current.leftChild);
                }
                if (current.value < high) {
                    stack.push(current.rightChild);
                }
            }

        }

        return result;
    }

}
