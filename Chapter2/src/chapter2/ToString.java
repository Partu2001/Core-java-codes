package chapter2;

public class ToString {
	int dd;
	int mm;
	int yy;
	ToString(){
		
	}
	ToString(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public String toString() {
		return dd + " " + mm  + " "+ yy;
	}
}
