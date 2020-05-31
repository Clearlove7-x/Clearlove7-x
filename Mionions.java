package cn.liayun.awt.frame;

public class Mionions {
	private String name;
	private int cost;
	private int atk;
	private int def;
	private int battlecry;
	private int deathrate;
	private boolean charge;
	private boolean taunt;
	private boolean windfury;
	private boolean divineshield;
	private int spelldamage;
	public Mionions() {
		super();
	}
	public int spelldamage() {
		return spelldamage;
		
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
	public int def() {
		return def;
		
	}
	public boolean charge() {
		return charge;
		
	}
	public boolean taunt() {
		return taunt;
		
	}public boolean windfury() {
		return windfury;
		
	}
	
	public boolean divineshield() {
		return divineshield;
		
	}
	public void setspelldamage(int spelldamage) {
		 this.spelldamage=spelldamage;
		
		
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public void setatk(int atk) {
		this.atk=atk;
		
	}
	public void ifcharge(boolean charge) {
		this.charge=charge;
		
	}
	public void iftaunt(boolean taunt) {
		this.taunt=taunt;
		
	}
	public void ifwindfury(boolean windfury) {
		this.windfury=windfury;
		
	}
	public void ifdivineshield(boolean divineshield) {
		this.divineshield=divineshield;
		
	}
	public void setcost(int cost) {
		this.cost=cost;
		
	}
	public void setdef(int def) {
		this.def=def;
		
	}
	public String getname(){
		return name;
		
		
	}
	public String getatk(){
		return String.valueOf(atk);
		
		
	}
	public int getspelldamage(){
		return spelldamage;
		
		
	}
	
	public String getdef(){
		return String.valueOf(def);
	}
	public String getcost(){
		return String.valueOf(cost);
	}
	public int getatk1(){
		return atk;
		
		
	}
	public boolean getcharge(){
		return charge;
		
		
	}
	public boolean gettaunt(){
		return taunt;
		
		
	}public boolean getwindfury(){
		return windfury;
		
		
	}public boolean getdivineshield(){
		return divineshield;
		
		
	}
	public int getdef1(){
		return def;
		
		
	}
	public int getcost1(){
		return atk;
		
		
	}
	
		
	/*Mionions[] mionion=new Mionions[30];{
		mionion[0]=new Mionions();
		mionion[0].setatk(2);
		mionion[0].setdef(1);
		mionion[0].setname("Leper Gnome");
		
	}*/

	

}
