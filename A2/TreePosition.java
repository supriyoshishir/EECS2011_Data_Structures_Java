
public interface TreePosition<E> extends Position<E> // inherits element()

	public void setElement(E o);
	public PositionList<Position<E>> getChildren();
	public void setChildren(PositionList<Position<E>> c);
	public TreePosition<E> getParent();
	public void setParent(TreePosition<E> v);
	
}
