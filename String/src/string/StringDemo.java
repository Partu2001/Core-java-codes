package string;

public class StringDemo {

    public static void reverString(){
        StringBuffer sb = new StringBuffer();

        sb.append("Prathmesh");

            String rev = " " ;
            for ( int i = sb.length()-1; i>=0; i--){
                rev = rev + sb.charAt(i);
            }
            System.out.println("Reverse String is : " + rev);
        }

    public static void main(String[] args) {

        reverString();
    }

}