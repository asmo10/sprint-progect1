package repl.it._195_OOP_3_getter.setter;

public class Db {

	private String Data;
	private int Yint;
	
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public int getYint() {
		return Yint;
	}
	public void setYint(int yint) {
		Yint = yint;
	}
	
	public void insertData(String data, int yint) {
		Data=data;
		Yint=yint;
	}
	
}
