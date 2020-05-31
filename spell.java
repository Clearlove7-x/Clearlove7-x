package cn.liayun.awt.frame;

public class spell {
	private String name;
	private int cost;
	public String name() {
		return name;
		
	}
	public int cost() {
		return cost;
		
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public String getcost(){
		return String.valueOf(cost);
	}
	public spell[] spell=new spell[30];	
	

}
