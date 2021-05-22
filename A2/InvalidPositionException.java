
public class InvalidPositionException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Creates an instance of the exception and assigns it a custom message.
	 * @param message
	 */
	public InvalidPositionException(String error){
		super(error);
	}

}