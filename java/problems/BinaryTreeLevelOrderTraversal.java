/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root == null) {
			return ans;
		}
		Queue<TreeNode> nodeQ = new LinkedList<>();
		Queue<Integer> levelQ = new LinkedList<>();
		nodeQ.add(root);
		levelQ.add(1);
		while (!nodeQ.isEmpty()) {
			TreeNode temp = nodeQ.poll();
			Integer level = levelQ.poll();
			List<Integer> l = null;
			if (ans.size() < level) {
				l = new ArrayList<>();
				ans.add(l);
			} else {
				l = ans.get(level - 1);
			}
			l.add(temp.val);
			if (temp.left != null) {
				nodeQ.add(temp.left);
				levelQ.add(level + 1);
			}
			if (temp.right != null) {
				nodeQ.add(temp.right);
				levelQ.add(level + 1);
			}
		}
		return ans;
	}
}