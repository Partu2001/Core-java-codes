package inheritanceItem;
import java.util.Scanner;
public class Music extends Item {
	String artist;
	int volume;
	
	Scanner sc=new Scanner(System.in);
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "Music [artist=" + artist + ", volume=" + volume + ", sc=" + sc + "]";
	}
	public Music() {
		
	}
	public Music(String artist, int volume, Scanner sc) {
		super();
		this.artist = artist;
		this.volume = volume;
		this.sc = sc;
	}
	
	public void accept() {
		 super.accept();
		System.out.println("Enter Music Details:");
		System.out.println("Enter Artist:");
		setArtist(sc.next());
		System.out.println("Enter Volume :");
		setVolume(sc.nextInt());
	}
	
	public void display() {
		super.display();
		System.out.println("Music Details:");
		System.out.println("Auther:" +getArtist());
		System.out.println(" Volume :" +getVolume());
		
	}
	
	
	
	

}
