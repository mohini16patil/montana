package student.interfaces;

public interface Reservable {
	
	boolean isReserved();
	
	boolean canBeReservedFor(Member mem);
	
	boolean reserveItemFor(Member mem);
	
	

}
