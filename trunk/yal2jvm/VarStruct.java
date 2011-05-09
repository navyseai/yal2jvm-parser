
/**
 * @author Joao Serra
 *
 */
public class VarStruct {

	String name, type;
	int line;
	
	/**
	 * @param name Name from the variable
	 * @param type Type of the variable
	 * @param line Line where the variable is on the code
	 */
	public VarStruct(String name, String type, int line)
	{
		this.name = name;
		this.type = type;
		this.line = line;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getLine() {
		return line;
	}
	
	
}
