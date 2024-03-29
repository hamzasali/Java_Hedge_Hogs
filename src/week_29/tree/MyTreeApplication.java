package week_29.tree;

public class MyTreeApplication {

    public static void main(String[] args) {

        MyTree tree = new MyTree();

        tree.insert(10);
        tree.insert(6);
        tree.insert(18);
        tree.insert(3);
        tree.insert(8);
        tree.insert(22);

        VisualizeTree.printTree(tree.root,null,false);

        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println(tree.countLeaves(tree.root));
        System.out.println(tree.findSumOfLeaves(tree.root));
        System.out.println(tree.height(tree.root));

    }
}
