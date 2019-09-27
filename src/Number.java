import java.util.NoSuchElementException;

public class Number extends ChekInput {

	public static int Find() {
		int q = 0;
		if (rim)
			q = FindRim();
		else
			q = Integer.parseInt(s);
		if (q > 10 | q < 1)
			throw new NoSuchElementException("Erorr");

		s = "";

		return q;

	}

	private static int FindRim() {
		for (int i = 0; i < 10; i++)
			if (RimNumbTen[i].equals(s))
				return i + 1;
		return 100;
	}

}
