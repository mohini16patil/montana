
public class KnightTest {

	public static void main(String[] args) {

	}

	private boolean isValid(int x, int y) {
		
		if(x>8 || y>8)
		{
			return false;
		}
		else
		{
			return true;
		}

	}

	public int solve(int x, int y, int count) {
		
		if(isValid(x+2,y+1))
		{
			solve(x+2,y+1,count+1);
		}
		return count;

	}

}
