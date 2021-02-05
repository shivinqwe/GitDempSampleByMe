
public class Sample {

	public static void main(String[] args) {
		String s= "selenium";
		char c[]=s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+c[i];
			System.out.println(rev);
		}

	}

}
