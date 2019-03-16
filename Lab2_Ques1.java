package labbook2;
abstract class Item
{
	public abstract void checkin();
	public abstract void checkout();
	public abstract void print();
	public abstract void addItem();
}
class ItemRet extends Item
{
	private int id;
	private String title;
	private int copies;
	public ItemRet (int id,String title,int copies)
	{
		this.id=id;
		this.title=title;
		this.copies=copies;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setCopies(int copies)
	{
		this.copies=copies;
	}
	public int getCopies()
	{
		return copies;
	}
	public String toString()
	{
		return (id+"\t"+title+"\t"+copies);
	}
	public void checkin()
	{
		System.out.println("Checkin Module");
	}
	public void checkout()
	{
		System.out.println("CheckOUT Module");
	}
	public void addItem()
	{
		System.out.println("Item Added");
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing Module");
	}
}
public class ProgAbstract {

	public static void main(String[] args) {
		ItemRet i =new ItemRet(101,"Java",6);
		i.checkin();
		i.checkout();
		i.addItem();
		i.print();
		System.out.println(i);
	}

}
