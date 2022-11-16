package week_30;

import week_29.tree.MyNode;
import week_29.tree.MyTree;
import week_29.tree.VisualizeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(10);
        tree.insert(6);
        tree.insert(4);
        tree.insert(20);

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println(inorderTraversal(tree.root));
        System.out.println(inorderTraversalWithIterationReturnList(tree.root));
        System.out.println(inOrderTraversalOther(tree.root));
    }

    public static List<Integer> inorderTraversal(MyNode root) {
        List<Integer> list = new ArrayList<>();

        recursiveTraversal(root, list);

        return list;
    }

    public static void recursiveTraversal(MyNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        recursiveTraversal(root.leftChild, list);
        list.add(root.value);
        recursiveTraversal(root.rightChild, list);
    }

    public static List<Integer> inorderTraversalWithIterationReturnList(MyNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<MyNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.leftChild;
            } else {
                root = stack.pop();
                list.add(root.value);
                root = root.rightChild;
            }
        }
        return list;
    }

    public static List<Integer> list = new ArrayList<>();
    public static List<Integer> inOrderTraversalOther(MyNode root){
        if (root == null) return list;
        inOrderTraversalOther(root.leftChild);
        if(root!=null){
            list.add(root.value);
        }
        inOrderTraversalOther(root.rightChild);
        return list;
    }
}
