
public class myNode extends SimpleNode implements Yal2jvmTreeConstants/*implements Node*/{

	private String token;
	private int startLine;
	private int endLine;

	public myNode(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	// Save information about the symbols
	public void setData(String token, int startLine, int endLine)
	{
		this.token = token;
		this.startLine = startLine;
		this.endLine = endLine;
	}
	
	
	public static Node jjtCreate(int id) {
        switch (id) {
        	case JJTMODULE:        return new myNodeModule(id);
        	case JJTDECLARATION :  return new myNodeDeclaration(id);
        	case JJTFUNCTION : return new myNodeFunction(id);
        	case JJTVARLIST :
        	case JJTARRAYELEMENT:
        	
        	case JJTASSIGN : return new myNodeAssign(id);
        	case JJTLHS :
        	case JJTRHS :
        	case JJTARRAYSIZE:
        	case JJTTERM :
        	case JJTEXPRTEST : return new myNodeExprtest(id);
        	case JJTWHILE : return new myNodeWhile(id);
        	case JJTIF :
        	case JJTCALL : return new myNodeCall(id);
        	

        	case JJTARRAYACCESS :
        	case JJTSCALARACCESS :
        	case JJTINDEX :

        	// avoid going to exception
        	case JJTSTMTLST :
        	case JJTARGUMENTLIST :
        		
        	// void return
          	// case JJTSTMT :  
            //case JJTARGUMENT :
        		
        default:
            throw new RuntimeException("Unknown node id: " + id);
        }
    }

}
