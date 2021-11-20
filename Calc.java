
import static java.lang.System.out;

public class Calc 
{	
	static int sub(int a, int b) {return a - b;}

	static int add(int a, int b)
	{
		return a + b;
	}

	public static void main(String[] args)
	{
		out.println(add(4, 5));
		out.println(sub(4, 5));
	}
}
