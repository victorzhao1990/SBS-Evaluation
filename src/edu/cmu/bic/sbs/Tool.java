package edu.cmu.bic.sbs;

/**
 * The Tool Class
 * @author Victor Zhao <xinyunzh@andrew.cmu.edu>
 *
 */
public class Tool {
	private String toolName;
	
	public String getTool() {
		return toolName;
	}
	
	public void setTool(String toolName) {
		this.toolName = toolName;
	}
	
	public String toString() {
		return "The tool is " + getTool();
	}
	
	Tool() {
		toolName = new String();
	}
}
