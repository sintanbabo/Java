package src.CallByValue;

public class CallByXXXTest
{
	public static void assignNewPerson(Person p)
	{
		p.setName("duna");
	}

	public static void main(String[] args)
	{
		Person a = new Person("sintanbabo");
		assignNewPerson(a);
		System.out.println(a);
	}
}
