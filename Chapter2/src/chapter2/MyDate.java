package chapter2;
public class MyDate {
	int d,m,y;

public MyDate() {
	
}
public  MyDate(int d,int m,int y) {
	this.d=d;
	this.m=m;
	this.y=y;
}
public String toString() {
	return d+" " +m+ " " +y;
}
public static void swap(MyDate d[]) {
	MyDate temp;
	temp=d[0];
	d[0]=d[1];
	d[1]=temp;
}
}
