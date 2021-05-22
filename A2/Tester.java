
public class Tester {

	public static void main(String[] args)
	 {
	 // make empty tree
	 LinkedTree<Character> T = new LinkedTree();
	 // add root
	 T.addRoot('A');
	 // add children of root
	 T.createNode('B', (TreeNode)(T.root()), new NodePositionList());
	 TreePosition C = T.createNode('C', (TreeNode)(T.root()), new NodePositionList());
	 T.createNode('D', (TreeNode)(T.root()), new NodePositionList());
	 // add children of node C
	 T.createNode('E', C, new NodePositionList());
	 TreePosition F = T.createNode('F', C, new NodePositionList());
	 T.createNode('G', C, new NodePositionList());
	 // add children of node F
	 T.createNode('H', F, new NodePositionList());
	 T.createNode('I', F, new NodePositionList());
	 // print out info about the tree
	 System.out.println("Size = " + T.size());
	 System.out.println("Here is the tree:");
	 System.out.println(T);
	 }
	
}