package model.exceptions;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 3303870181677866627L;
	
	public DomainException(String message) {
		super(message);
	}

}
