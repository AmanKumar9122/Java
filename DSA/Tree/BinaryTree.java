import java.util.*;
public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right; 

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Btree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");   
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1 ;
        }
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int lcount = count(root.left);
            int rcount = count(root.right);
            return lcount+rcount+1;
        }
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            int lsum = sum(root.left);
            int rsum = sum(root.right);
            return lsum + rsum + root.data;
        }
        public static int diameter(Node root){  //time complexity= O(n^2)
            if(root==null){
                return 0;
            }
            int ldiam = diameter(root.left);
            int rdiam = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int selfdiam = lh + rh +1;
            return Math.max (Math.min(ldiam,rdiam), selfdiam);
        }
        static class Info{
            int diam;
            int ht;

            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
            public static Info diameter2(Node root){ //time complexity= O(n)
                if(root==null){
                    return new Info(0, 0);
                }
                Info leftInfo = diameter2(root.left);
                Info rightInfo = diameter2(root.right);
                int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
                int ht = Math.max(leftInfo.ht,rightInfo.ht) + 1;
                return new Info(diam, ht);
            }
        }
        public static boolean isIdentical(Node node,Node subRoot){
            if(node==null&subRoot==null){
                return true;
            }else if(node==null||subRoot==null|| node.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(node.
            
            left, subRoot.left)){
                return false;
            }
            if(!isIdentical(node.right, subRoot.right)){
                return false;
            }
            return true;
            }
        public static boolean isSubtree(Node root,Node subRoot){
            if(root==null){
                return false;
            }
            if(root.data == subRoot.data){
                return true;
            }
            return isSubtree(root.left, subRoot.left)||isSubtree(root.right, subRoot.right);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Btree tree = new Btree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelOrder(root);
        System.out.println();
        System.out.println(tree.height(root));
        System.out.println();
        System.out.println(tree.count(root));
        System.out.println();
        System.out.println(tree.sum(root));
        System.out.println();
        System.out.println(tree.diameter(root));
        System.out.println();
        Btree.Info info = new Btree.Info(0, 0);
        System.out.println(info.diameter2(root).diam);
        System.out.println(info.diameter2(root).ht);

    }
}