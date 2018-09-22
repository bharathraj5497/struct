import java.util.*;
class TestProg
{
	public static void main(String []ss)
	{
		List<String> li = new ArrayList<String>();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		for(String ele : li)
		{
		
			System.out.println(ele);
			li.remove("three");
		}
	}
}
