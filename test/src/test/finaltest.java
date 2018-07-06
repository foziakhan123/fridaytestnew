package test;

public class finaltest {

	public static void main(String[] args) {
		
		OfflineExercies();
		doublechar ();
		System.out.println(getSandwich(8,7,8));
		evenlySpaced();
		
		
	}
	
	
	public static void OfflineExercies () {
		

		String s = "The";
		String [] s1 = s.split("");
		for (int i = 0; i<s1.length; i++){
			
			System.out.println(s1);
		}
		
		
		
	} 
	
	public static void doublechar() {
		
		
		String a = "breadjambread";
		String a1 = a.substring(5, 8);
		System.out.println(a1);
		
		
		String b = "xxbreadjambreadyy";
		String b1= b.substring(7,10);
		System.out.println(b1);
		
		String c= "xxbreadyy";
		String c1 = c.substring(c.length()-2);
		System.out.println(c1);
		
		String d= "xxbreadhoneybreadyy";
		String d1= d.substring(7,12);
		System.out.println(d1);
		
	
		
	//	return "";
		
		
	}
	
	public static String getSandwich(int a, int b, int c) {
		
		
		if (a == b && b== c && a==c ) {
			return "true";
		}
		
		else if (a!=b && a!=c && b!=c) {
				return "false";
				
	
		}
		else 
		return "";
		
		
	}
	
	
	public static void evenlySpaced () {
		
		String n= "Hello";
		String n1 = n.substring(0,2);
		System.out.print(n1);
		
		String m = "Hello";
		String m1 = m.substring(m.length()-2); 
		System.out.println(m1);
		
		
	}
	
	public static String nTwice(String input) {
		
		
		
	if (input.equalsIgnoreCase("ly" )) {
		return "true";
		
	}
	else 
	return input;
		
		
		
	}
	
	
		
	}

	
