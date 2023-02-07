package activity4;

public class Activity4_1 {

	// Author: Miriam Murà Calamardo
		// Data: 15/12/2022

		/*
		 * Escriu el mètode caractersCentrals que retorna una cadena amb el caràcter
		 * central de l’argument si la longitud és senar i retorna els dos caràcters
		 * centrals si la longitud de l’argument és parell.
		 * 
		 * Signatures de les funcions 
		 * public static String caractersCentrals(String str)
		 */

		public static void main(String[] args) {
			test1caractersCentrals();
			test2caractersCentrals();
		}
		
		public static String caractersCentrals(String str) {
			
			String resultat="";
			int longitud=str.length();
			if(str.length()%2==0) {
				//parell
				int pos=longitud/2-1;
				resultat+=str.charAt(pos);
				resultat+=str.charAt(pos+1);
			}else {
				//senar 
				int pos=longitud/2;
				resultat+=str.charAt(pos);		
			}
			
			return resultat;
		}
		
		public static void test1caractersCentrals() {

			String str="hola";
			String resultatEsperat = "ol";
			
			System.out.printf("caractersCentrals(%s) -> %s  ", str, resultatEsperat);
			if (!resultatEsperat.equals(caractersCentrals(str))) {
				System.out.println("Test NO Okey!!!");
			} else {
				System.out.println("Test Okey");
			}
		}
		
		public static void test2caractersCentrals() {

			String str="holas";
			String resultatEsperat = "l";
			
			System.out.printf("caractersCentrals(%s) -> %s  ", str, resultatEsperat);
			if (!resultatEsperat.equals(caractersCentrals(str))) {
				System.out.println("Test NO Okey!!!");
			} else {
				System.out.println("Test Okey");
			}
		}

}
