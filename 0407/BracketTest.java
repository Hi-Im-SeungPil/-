package bracketTest;

public class BracketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OptExp exp = new OptExp();
		String str = "if(3>2) {System.out.println(true)}";
		
		boolean result = exp.testPair(str);
		System.out.println(result);

	}

}
