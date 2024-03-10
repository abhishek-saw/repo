package DSAInJAVA.Trees;

public class NumberGreaterThanX {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(1);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        int x = 5;
        System.out.println(numNodeGreater(root,x));
    }
    public static int numNodeGreater(TreeNode<Integer> root, int x) {
        if(root==null){
            return 0;
        }
        int count = 0;
        if(root.data>x){
            count++;
        }
        for(TreeNode<Integer> treeNode : root.children){
            count+=numNodeGreater(treeNode,x);
        }
        return count;
    }
}
