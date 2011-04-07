import java.util.ArrayList;


/**
 * @author Joao Serra
 * Structure for function information
 */
public class FuncStruct {

	public String name, returnName, returnType, returnValue;
	public ArrayList<VarStruct> inputList;
	public ArrayList<VarStruct> varList;
	

	/**
	 * Constructor
	 * @param name The name of the function
	 */
	public FuncStruct(String name)
	{
		this.name = name;
		this.returnType = "void";
		this.inputList = new ArrayList<VarStruct>();
		this.varList = new ArrayList<VarStruct>();
	}
	
	/**
	 * Constructor
	 * @param name The name of the function
	 * @param returnType The type of the returning value
	 * @param returnName The name of the returning value
	 */
	public FuncStruct(String name, String returnType, String returnName)
	{
		this.name = name;
		this.returnType = returnType;
		this.returnName = returnName;
		this.inputList = new ArrayList<VarStruct>();
		this.varList = new ArrayList<VarStruct>();
	}
	
	public void addInput(VarStruct a)
	{
		this.inputList.add(a);
	}
	
	public void addVar(VarStruct a)
	{
		this.varList.add(a);
	}
	
	public ArrayList<VarStruct> getInput()
	{
		return this.inputList;
	}
	
	public ArrayList<VarStruct> getVars()
	{
		return this.varList;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
