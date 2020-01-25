public class MemoryPrint
{
	private int a;
	private int b;

	public String toString()
	{
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}

	public static void main(String[] args)
	{
		MemoryPrint a = new MemoryPrint();
		MemoryPrint b = a;

		System.out.println(a);
		System.out.println(b);

		return ;
	}
}
