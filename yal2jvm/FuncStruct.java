import java.util.HashMap;


/**
 * @author Joao Serra
 * Structure for function information
 */
public class FuncStruct {

	public String name, returnName, returnType, returnValue;
	public HashMap<String,VarStruct> inputList;
	public HashMap<String, VarStruct> varList;
	

	/**
	 * Constructor
	 * @param name The name of the function
	 */
	public FuncStruct(String name)
	{
		this.name = name;
		this.returnType = "void";
		this.inputList = new HashMap<String,VarStruct>();
		this.varList = new HashMap<String,VarStruct>();
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
		this.inputList = new HashMap<String,VarStruct>();
		this.varList = new HashMap<String,VarStruct>();
	}
	
	public void addInput(String name, String type, int line)
	{
		VarStruct temp = new VarStruct(name, type, line);
		this.inputList.put(name,temp);
	}
	
	public void addVar(String name, String type, int line)
	{
		VarStruct temp = new VarStruct(name, type, line);
		this.varList.put(name,temp);
	}
	
	public HashMap<String,VarStruct> getInput()
	{
		return this.inputList;
	}
	
	public HashMap<String,VarStruct> getVars()
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
