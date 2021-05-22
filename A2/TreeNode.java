
public class TreeNode<E> implements TreePosition<E> {
	
	private E element; // element stored at this node
	private TreePosition<E> parent; // adjacent node
	private PositionList<Position<E>> children; // children nodes
	@Override
	public E getElement() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setElement(E o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public PositionList<Position<E>> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setChildren(PositionList<Position<E>> c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TreePosition<E> getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setParent(TreePosition<E> v) {
		// TODO Auto-generated method stub
		
	}

}