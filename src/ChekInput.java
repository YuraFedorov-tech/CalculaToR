import java.math.BigInteger;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ChekInput {
	protected static String s;
	private static int previosZnak;
		static boolean arabs;
		static boolean rim;
		static int meanZnak;
		static String []RimNumbTen;
		static int z;
		static int probel;
		static BigInteger ans ;
	public ChekInput() {
		s = "0";
		arabs = false;
		rim = false;
		 ans = BigInteger.ZERO;
		previosZnak=0;
		meanZnak=3;
		 String []	RimNumbTen1= {"I","II","III","IV","V","VI","VII", "VIII","IX","X"};
		 RimNumbTen=RimNumbTen1;
		 probel=0;
		
		 
	}

	public static void Chek(char ch, int symbol) {

		if(ChekRim(ch)) {
		
			if(s.equals("0"))
				s="";
			s+=ch;
			if(arabs |(probel==1&&previosZnak==1))
				throw new NoSuchElementException("Erorr");
			rim=true;
			 probel=0;
				previosZnak=1;
			return;
		}
		if(ChekArab(ch)) {
		
			arabs=true;
			s+=ch;
			if(rim |(probel==1&&previosZnak==1))
				throw new NoSuchElementException("Erorr");
			 probel=0;
				previosZnak=1;
			return;
		}
		if(ch==' ' ) {
			
			 probel=1;
				return;
		}	
	if(symbol==13) {
		if(previosZnak!=1)
			throw new NoSuchElementException("Erorr");
		 z=	Number.Find();
		Count.Count(z);
		return;
	}
		
		int x=Operator(ch);
		if(x<5) {
			
			if(previosZnak==0 ) 
				throw new NoSuchElementException("Erorr");
	
		
			 z=	Number.Find();
			Count.Count(z);
			meanZnak=x;
			s="";
			previosZnak=0;
			return;
		}
		if(4==4)
			throw new NoSuchElementException("Erorr");
		
	}


	private static boolean ChekArab(char charAt) {
		if(charAt>='0' &&charAt<='9'  )
			return true;
			return false;
	}
	private static boolean ChekRim(char charAt) {
		if(charAt=='I' ||charAt=='V'||charAt=='X'  )
		return true;
		return false;
	}
	
	private static int Operator(char charAt) {
		if(charAt=='*')
			return 1;
		if(charAt=='/')
			return 2;
		if(charAt=='+')
			return 3;
		if(charAt=='-')
			return 4;
		return 5;
	}	
	public static BigInteger getAns() {
	
		return ans;
	}

	}


