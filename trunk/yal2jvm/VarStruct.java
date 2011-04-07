
/**
 * @author Joao Serra
 *
 */
public class VarStruct {

	String name, type, value;
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
	
	public void setValue(String a)
	{
		this.value = a;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public int getLine() {
		return line;
	}
	
	
}
