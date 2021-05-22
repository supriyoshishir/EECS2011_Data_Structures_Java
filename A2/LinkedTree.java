import java.util.Iterator;

public class LinkedTree<E> implements Tree<E> {
	
	protected TreePosition<E> root; // reference to the root
	protected int size; // number of nodes

	protected TreePosition<E> checkPosition(Position<E> v) throws InvalidPositionException
	{
	if (v == null || !(v instanceof TreePosition))
	 throw new InvalidPositionException("The position is invalid");
	return (TreePosition<E>) v;
	}

	@Override
	public Position<E> root() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> parent(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numChildren(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isInternal(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExternal(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRoot(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> positions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addRoot(E e) throws NonEmptyTreeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreePosition<E> createNode(E element, TreePosition<E> parent, PositionList<Position<E>> children) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void swapElements(Position<E> v, Position<E> w) throws InvalidPositionException {
		// TODO Auto-generated method stub
		
	}
	