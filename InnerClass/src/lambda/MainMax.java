package lambda;

public class MainMax {

	public static void main(String[] args) {
		
		Maximum m=(a,b) ->{ if(a>b) {
	            return a;
		}
		else {
		return b;
		}
		
	};
	
	System.out.println(" Greater number is:" +m.max(10, 7));
	}

}
