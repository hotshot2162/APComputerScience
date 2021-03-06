package Module15._04ComparableInterfaces;

/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file MyScience2.java
 * @package Module15._03Interfaces
 * 
 * @purpose 
 */

public class MyScience3 extends Homework3
{
	int pages;

	@Override
	public void createAssignment(int p)
	{
		super.setPagesRead(p);
		super.setTypeHomework("Science");
		pages = p;
	}
	
	public String toString()
	{
		return super.getTypeHomework() + ": must read " + super.getPagesRead() + " pages.";
	}
}
