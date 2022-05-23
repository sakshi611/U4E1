package U4E1;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Sakshi";
		int len = str.length();
		int ind = str.indexOf('i');
		String new_str = str.concat(" Gupta");
		boolean res1 = str.contains("sa");
		boolean res2 = str.equalsIgnoreCase("SAKSHI");
		System.out.println(len+ind+new_str+res1+res2);

	}

}
