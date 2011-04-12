
public class myNode extends SimpleNode implements Node{

	private String token;
	private int startLine;
	private int endLine;

	public myNode(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jjtAddChild(Node n, int i) {
		// TODO Auto-generated method stub
		
	}

	// Save information about the symbols
	public void setData(String token, int startLine, int endLine)
	{
		this.token = token;
		this.startLine = startLine;
		this.endLine = endLine;
	}
	
	@Override
	public void jjtClose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node jjtGetChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int jjtGetNumChildren() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Node jjtGetParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void jjtOpen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jjtSetParent(Node n) {
		// TODO Auto-generated method stub
		
	}

}
