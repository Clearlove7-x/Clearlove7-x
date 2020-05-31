package cn.liayun.awt.frame;

public class weapon extends Basic{
	private String name;
	private int cost;
	private int atk;
	private int durable;
	public weapon() {
		super();
	}
	public String name() {
		return name;
		
	}
	public int atk() {
		return atk;
	}
	public int cost() {
		return cost;	
	}
	public int durable() {
		return durable;
		
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public void setatk(int atk) {
		this.atk=atk;
		
	}
	public void setdurable(int durable) {
		this.durable=durable;	
	}
	public void setcost(int cost) {
		this.cost=cost;
		
	}
	public String getname(){
		return name;
	}
	public String getatk(){
		return String.valueOf(atk);
		
	}
	public String getdurable(){
		return String.valueOf(durable);
		
	}
	public String getcost(){
		return String.valueOf(cost);
	}
	public int getatk1() {
		return atk;
	}
	public int getdurable1() {
		return durable;
	}
	public int getcost1() {
		return cost;
	}
	

}
