import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.NoSuchElementException;

public class Input {
	
	public Input() {
		 
	}

	public static void Input() throws IOException {
		
		BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
		
	int chan=1;
			while( true | chan==1) {
			  	
		boolean secondStroka=false;
    	int symbol = 0 ;
    	ChekInput q=new ChekInput();
    	Count w=new Count(0);
    	
    
   
    	    String s= bufferedReader.readLine();  	    
    	      s+="/ ";
    	  for(int i=0;i<s.length();i++) {
    		  
    	    	q.Chek(s.charAt(i),symbol);
    	 
    	  }

    	  
    	int r=0;
    	 BigInteger ans[]= {BigInteger.ZERO,BigInteger.ZERO};
    	 
    	if(q.rim)
    		ans[1]=BigInteger.ONE;
    	
    	 ans[0] = Count.getAns();
    	 Print.Print(ans);
  
    	 chan=0;
    	 if(!bufferedReader.ready())
		    	break;
		 
			} 	
	}


}
