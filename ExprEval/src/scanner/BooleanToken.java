/**
 * 
 */
package scanner;

/**
 * Boolean类Token
 * @author Aaron-Qiu
 *
 */
public class BooleanToken extends Token {
	boolean value;
	
	/**
	 * @param 用于初始化的字符串
	 */
	public BooleanToken(String str) {
		type = "bool";
		tag = Tag.BOOL;
		value = str.equalsIgnoreCase("true") ? true : false;
	}
	
	/**
	 * 获取boolean型token的字符串值
	 * @return boolean型token的字符串值
	 */
	public String getValueofString() {
		return value ? "true" : "false"; 
	}
	
	/**
	 * 获取boolean型token的bool值
	 */
	public boolean getValue() {
		return value;
	}
}
