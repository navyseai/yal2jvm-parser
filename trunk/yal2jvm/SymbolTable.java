
import java.util.HashMap;

/**
 * @author Joao Serra
 * It contains a list of modules, which have variables, and functions, which have variables
 */
public class SymbolTable {

    public HashMap<String, ModuleStruct> myModules;
    
    
	/**
	 * Constructor
	 */
	public SymbolTable()
	{
		this.myModules = new HashMap<String, ModuleStruct>();
	}
	
	/**
	 * @param name Name from the module
	 */
	public void addModule(String name)
	{
		ModuleStruct temp = new ModuleStruct(name);
		myModules.put(name, temp);
	}
	
	public ModuleStruct getModule(String name)
	{
		return myModules.get(name);
	}
}
