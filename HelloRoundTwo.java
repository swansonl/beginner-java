public class HelloRoundTwo
{
	public static void printALine(int user)
	{
		for (int j = 0; j < user; j++)
			System.out.print("Hello ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		int l = 0;
		while (l >= 0)
		{
			l = IO.readInt("Your number: ");
			if (l >=0)
				printALine(l);
		}
	}
}