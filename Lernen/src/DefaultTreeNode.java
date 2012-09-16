public class DefaultTreeNode implements SimpleTreeNode
{
	private int CAPACITY;
	private String name;
	private SimpleTreeNode[] childs;
	private int childcnt;
	
	public DefaultTreeNode(String name)
	{
		this.CAPACITY = 5;
		this.name = name;
		this.childs = new SimpleTreeNode[CAPACITY];
		this.childcnt = 0;
	}
	
	public void addChild(SimpleTreeNode child)
	{
		if (childcnt >= CAPACITY)
		{
			CAPACITY *= 2;
			SimpleTreeNode[] newchilds = new SimpleTreeNode[CAPACITY];
			for (int i = 0; i < childcnt; ++i)
			{
				newchilds[i] = childs[i];
			}
			childs = newchilds;
		}
		childs[childcnt++] = child;
	}
	public int getChildCnt()
	{
		return childcnt;
	}
	public SimpleTreeNode getChild(int pos)
	{
		return childs[pos];
	}
	public String toString()
	{
		return name;
	}
}