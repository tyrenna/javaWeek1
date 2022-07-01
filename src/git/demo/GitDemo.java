package git.demo;

public class GitDemo {
// Class practice
	public static void main(String[] args) {
	boolean bit = true;
	byte bite = 23;
	short sh = 234;
	char ch = 'a';
	int age = 29;
	float fl = (float)123.4;
	long lo = 943739486784L;
	double d = 0.0000003;
	
	// format scientific conversion
	
	String sd = String.format("%.7f", d);
	
	System.out.println("d=" + sd);
	//go over above could not get to work at first forgot sysout
	
	System.out.println("d=" + d);
	
	byte by = (byte)3895059;
	System.out.println("by=" + by);
	// sys overflow - left over value results in 19
		
		
		

	}

}
