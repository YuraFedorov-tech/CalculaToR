import java.math.BigInteger;
import java.util.NoSuchElementException;

public class Count extends Number {

	public Count(int n) {
	
		
	}

	public static void Count(int q) {

	if(meanZnak==1)
		Multiplay(q);
	if(meanZnak==2)
		Divide(q);
		
	if(meanZnak==3)
		Plus(q);
	if(meanZnak==4)
		Minus(q);

		
	}

	private static void Minus(int q) {

		ans=ans.subtract(new BigInteger(Integer.toString(q)));
	}

	private static void Plus(int q) {
	
		ans=ans.add(new BigInteger(Integer.toString(q)));
	}

	private static void Divide(int q) {
	if(q==0)
		throw new NoSuchElementException("Erorr");
		
	ans=ans.divide(new BigInteger(Integer.toString(q)));
	}

	private static void Multiplay(int q) {

		ans=ans.multiply(new BigInteger(Integer.toString(q)));	
	}



	public static boolean Rim() {
	
		return rim;
	}

}
