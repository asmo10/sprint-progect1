package repl.it._195_OOP_3_getter.setter;

public class Main {

	 public static void main(String[] args) {
		   
		   Db db = new Db();
		   db.insertData("aaa",123);
		   
		   
		    System.out.println(db.getData());//aaa
		    System.out.println(db.getYint());//123
		  
		  db.setData("zzz");
		  db.setYint(200);
		  
		  System.out.println(db.getData());//zzz
		    System.out.println(db.getYint());//200
		    
		  }
		}
