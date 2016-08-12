package student.collectionsgenerics;

public class Pair<F,S> {
	
	// Write your Pair class here. Add a main method to test it with different types
	
	F first;
	S second;
	
	Pair(F pair1, S pair2){
		super();
		this.first = pair1;
		this.second = pair2;
		
	}

	public F getPair1() {
		return first;
	}

	public void setPair1(F pair1) {
		this.first = pair1;
	}

	public S getPair2() {
		return second;
	}

	public void setPair2(S pair2) {
		this.second = pair2;
	}
	
	public static void  main(String [] args)
	{
		Pair <String,Integer> p = new Pair<>("Eashan ",2);
		
		
		System.out.println(p.getPair1() +""+ p.getPair2());
	}
	

	
}