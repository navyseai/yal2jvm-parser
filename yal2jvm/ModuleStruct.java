import java.util.ArrayList;


/**
 * @author Joao Serra
 *
 */
public class ModuleStruct {

	public String name;
	public ArrayList<FuncStruct> funcList;
	public ArrayList<VarStruct> varList;
	
	/**
	 * Constructor
	 * @param name Name from the module
	 */
	public ModuleStruct(String name)
	{
		this.name = name;
		this.funcList = new ArrayList<FuncStruct>();
		this.varList = new ArrayList<VarStruct>();
		
	}
	
	/**
	 * @param newFunc function from module
	 */
	public void addFunc(FuncStruct newFunc)
	{
		funcList.add(newFunc);
	}
	
	
	/**
	 * @param newVar global variable
	 */
	public void addVar(VarStruct newVar)
	{
		varList.add(newVar);
	}
	
	public  ArrayList<FuncStruct> getFunctions()
	{
		return this.funcList;
	}
	
	public  ArrayList<VarStruct> getVariables()
	{
		return this.varList;
	}
}
