/**
 * @Description
 * @Author: Lihuaidong
 * @Date: Created at 16:55 2020/7/16
 */
public class TreeNode {

	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value) {
		this.value = value;
	}

	public void search(TreeNode node) {
		if(node == null) {
			return;
		}

		search(node.left);
		search(node.right);
		System.out.println(node.value);
	}

}
