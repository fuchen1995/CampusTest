package com.junittest;

class TreeNode {

	// 左节点(儿子)
	private TreeNode lefTreeNode;

	// 右节点(儿子)
	private TreeNode rightNode;

	// 数据
	private int value;

	public TreeNode(int value) {

		this.value = value;
	}

	public TreeNode getLefTreeNode() {
		return lefTreeNode;
	}

	public void setLefTreeNode(TreeNode lefTreeNode) {
		this.lefTreeNode = lefTreeNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class TreeRoot {

	private TreeNode treeRoot;

	public TreeNode getTreeRoot() {
		return treeRoot;
	}

	public void setTreeRoot(TreeNode treeRoot) {
		this.treeRoot = treeRoot;
	}
}

public class TreeTest {

	public static void preTraverseBTree(TreeNode rootTreeNode) {

		if (rootTreeNode != null) {

			// 访问左节点
			preTraverseBTree(rootTreeNode.getLefTreeNode());

			// 访问根节点
			System.out.println(rootTreeNode.getValue());

			// 访问右节点
			preTraverseBTree(rootTreeNode.getRightNode());
		}

	}

	public static void createTree(TreeRoot treeRoot, int value) {

		// 如果树根为空(第一次访问)，将第一个值作为根节点
		if (treeRoot.getTreeRoot() == null) {
			TreeNode treeNode = new TreeNode(value);
			treeRoot.setTreeRoot(treeNode);

		} else {

			// 当前树根
			TreeNode tempRoot = treeRoot.getTreeRoot();

			while (tempRoot != null) {
				// 当前值大于根值，往右边走
				if (value > tempRoot.getValue()) {

					// 右边没有树根，那就直接插入
					if (tempRoot.getRightNode() == null) {
						tempRoot.setRightNode(new TreeNode(value));
						return;
					} else {
						// 如果右边有树根，到右边的树根去
						tempRoot = tempRoot.getRightNode();
					}
				} else {
					// 左没有树根，那就直接插入
					if (tempRoot.getLefTreeNode() == null) {
						tempRoot.setLefTreeNode(new TreeNode(value));

						return;
					} else {
						// 如果左有树根，到左边的树根去
						tempRoot = tempRoot.getLefTreeNode();
					}
				}
			}
		}
	}

	public static int getHeight(TreeNode treeNode) {

		if (treeNode == null) {
			return 0;
		} else {

			// 左边的子树深度
			int left = getHeight(treeNode.getLefTreeNode());

			// 右边的子树深度
			int right = getHeight(treeNode.getRightNode());

			int max = left;

			if (right > max) {
				max = right;
			}
			return max + 1;
		}

	}
}