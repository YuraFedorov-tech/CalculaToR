import java.math.BigInteger;

public class Print extends ChekInput {

	public static void Print(BigInteger[] ans) {

		String s = "";
		if (ans[1].compareTo(BigInteger.ONE) == 0)
			ChangeToRim(ans[0]);
		else
			System.out.print(ans[0]);
		System.out.println();
	}

	private static void ChangeToRim(BigInteger ans) {
		String[] RimNumbTen = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
		int arab[] = { 1000, 500, 100, 50, 10 };
		int y = ans.compareTo(BigInteger.ZERO);
		if (y <= 0) {
			if (y == 0)
				System.out.print("null");
			if (y < 0)
				System.out.print("Rome have note unary minus");
			return;
		}
		BigInteger Arab[] = new BigInteger[5];
		for (int i = 0; i < 5; i++)
			Arab[i] = new BigInteger(Integer.toString(arab[i]));
		String rome[] = { "M", "D", "C", "L", "X" };
		for (int i = 0; i < 5; i++) {
			while (ans.compareTo(Arab[i]) == 1) {
				System.out.print(rome[i]);
				ans = ans.subtract(Arab[i]);
			}
			if (ans.compareTo(Arab[i]) == 0) {
				System.out.print(rome[i]);
				return;
			}
		}
		int w = Integer.parseInt(ans.toString());
		String s = FindTen(w);
		System.out.print(s);

		return;
	}

	private static String FindTen(int w) {
		return RimNumbTen[w - 1];

	}

}
