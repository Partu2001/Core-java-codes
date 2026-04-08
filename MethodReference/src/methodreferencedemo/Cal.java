package methodreferencedemo;

public class Cal {


	    public   void add(){
	        System.out.println("A + B");
	    }

	    public void sub(){

	    }

	    public static void main(String[] args) {


	        //static

//	        CalInterface ci = Cal::add;
//	        ci.Cal();


	        // non static

	        Cal c1 = new Cal();

//	        CalInterface c = c1::add;
//	        c.Cal();



	        // constructor

	        CalInterface cc = Cal:: new;
	        cc.cal();
	    }
	}


