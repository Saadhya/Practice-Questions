package BST;

// samrat
// 8700276540-
public class BSTPractice {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  // leetcode 938
  public int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null) {
      return 0;
    }

    int sum = 0;

    if (low <= root.val && root.val <= high) {
      sum += root.val;
    }

    sum += rangeSumBST(root.left, low, high);
    sum += rangeSumBST(root.right, low, high);

    return sum;
  }

  // small optimization
  public int rangeSumBST2(TreeNode root, int low, int high) {
    if (root == null) {
      return 0;
    }

    int sum = 0;

    if (root.val < low) {
      sum = rangeSumBST2(root.right, low, high);
    } else if (root.val > high) {
      sum = rangeSumBST2(root.left, low, high);
    } else {
      sum += root.val;
      sum += rangeSumBST2(root.left, low, high);
      sum += rangeSumBST2(root.right, low, high);
    }

    return sum;
  }

  // leetcode 230
  public void getInorder(TreeNode root, ArrayList<Integer> inorder) {
    if (root == null) {
      return;
    }

    getInorder(root.left, inorder);
    //
    inorder.add(root.val);
    // right
    getInorder(root.right, inorder);
  }

  public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> inorder = new ArrayList<>();

    // sorted
    getInorder(root, inorder);
    return inorder.get(k - 1);
  }

  // leetcode 230 efficient solution
  int ans;
  int K;

  public void inorder(TreeNode root) {
    if (root == null || k < 0) {
      return;
    }

    inorder(root.left);

    K--;
    if (K == 0) {
      ans = root.val;
    }

    inorder(root.right);
  }

  public int kthSmallest2(TreeNode root, int k) {
    ans = 0;
    K = k;

    inorder(root);
    return ans;
  }

  // leetcode 230 Iterative solution
  public void addAllLeft(TreeNode root, Stack<TreeNode> st) {
    while (root != null) {
      st.push(root);
      root = root.left;
    }
  }

  public int kthSmallest3(TreeNode root, int k) {
    Stack<TreeNode> st = new Stack<>();

    addAllLeft(root, st);

    while (k > 1) {
      TreeNode topNode = st.pop();

      if (topNode.right != null) {
        addAllLeft(topNode.right, st);
      }
      k--;
    }

    return st.peek().val;
  }

  // leetcode 1373
  public class BstPair {

    int min;
    int max;
    boolean isBst;
    int sum;

    public BstPair(int min, int max, boolean isBst, int sum) {
      this.min = min;
      this.max = max;
      this.isBst = isBst;
      this.sum = sum;
    }

    public BstPair() {}
  }

  int maxSum;

  public BstPair isBST(TreeNode root) {
    if (root == null) {
      return new BstPair(Integer.MAX_VALUE, Integer.MIN_VALUE, true, 0);
    }

    BstPair lst = isBST(root.left); // min, max, isBST
    BstPair rst = isBST(root.right);

    BstPair myAns = new BstPair();

    if (lst.isBst && rst.isBst && lst.max < root.val && rst.min > root.val) {
      myAns.isBst = true;
      myAns.sum = lst.sum + rst.sum + root.val;
      maxSum = Math.max(maxSum, myAns.sum);
    } else {
      myAns.isBst = false;
    }

    myAns.max = Math.max(root.val, rst.max);
    myAns.min = Math.min(root.val, lst.min);

    return myAns;
  }

  public int maxSumBST(TreeNode root) {
    maxSum = 0;
    isBST(root);
    return maxSum;
  }

  public static void main(String[] args) {}
}
