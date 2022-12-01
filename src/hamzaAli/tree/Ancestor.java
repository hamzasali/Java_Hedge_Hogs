package hamzaAli.tree;

import week_32.lowest_common_ancestor.TreeNode;

public class Ancestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int max = Math.max(p.val, q.val);
        int min = Math.min(p.val, q.val);

        if (root == null) return null;

        while (root != null) {
            if (root.val > max) {
                root = root.left;
                System.out.println(root);
            } else if (root.val < min) {
                root = root.right;
                System.out.println(root);
            } else {
                return root;
            }
        }
        return null;
    }


}
