import java.util.HashMap;


/**
 * @author Joao Serra
 *
 */
public class ModuleStruct {

	public String name;
	public HashMap<String, FuncStruct> funcList;
	public HashMap<String, VarStruct> varList;
	
	/**
	 * Constructor
	 * @param name Name from the module
	 */
	public ModuleStruct(String name)
	{
		this.name = name;
		this.funcList = new HashMap<String, FuncStruct>();
		this.varList = new HashMap<String, VarStruct>();
		
	}
	
	/**
	 * @param newFunc function from module
	 */
	public void addFunc(String name, String returnType, String returnName)
	{
		FuncStruct temp = new FuncStruct(name, returnType, returnName);
		funcList.put(name, temp);
	}
	
	
	/**
	 * @param newVar global variable
	 */
	public void addVar(String name, String type, int line)
	{
		VarStruct temp = new VarStruct(name, type, line);
		varList.put(name, temp);
	}
	
	public HashMap<String, FuncStruct> getFunctions()
	{
		return this.funcList;
	}
	
	public HashMap<String, VarStruct> getVariables()
	{
		return this.varList;
	}
}
