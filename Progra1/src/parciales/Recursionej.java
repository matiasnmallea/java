package parciales;

public class Recursionej {
	
	public static String estaPrimera(String s1, String s2) {   // compara dos strings y devuelve el que su inicial esté primera en el abecedario
		
		if (s1.length()==0) {
			return s1;
		}
		if (s2.length()==0) {
			return s2;
		}
		if (s1.charAt(0) == s2.charAt(0)){
			return s1.charAt(0) + estaPrimera(resto(s1),resto(s2));
		}
		if (s1.charAt(0) >= s2.charAt(0)){
			return s2;
		}
		else {
			return s1;
		}
	}

	public static String letrasMayores(String s1, String s2) {  // compara y recorre dos strings y devuelve la letra que esté primero en el
																// abecedario para cada posicion de los strings
		if ((s1.length()) == 0) {
			return s2;
		}
		
		if ((s2.length()) == 0) {
			return s1;
		}
	
		if (s1.charAt(0) > s2.charAt(0)) {
			return s1.charAt(0) + letrasMayores(resto(s1), resto(s2));
		}
		else {
			return s2.charAt(0) + letrasMayores (resto(s1), resto(s2));
		}
	}
	
	public static String eliminarVocalesYRevertir(String s) { // elimina las posiciones que contengan vocales de un string y luego lo invierte
		
		if (s.length() == 0) {
			return s;
		}
		if (esVocal(s.charAt(0))) {
			
			return eliminarVocalesYRevertir(resto(s));
		}
		else {
			return eliminarVocalesYRevertir(resto(s)) + s.charAt(0);
		}
	}
	
	
	public static String eliminarAPartir(String s, int p, char c) {  // elimina a partir de la posicion indicada la letra pasada como parámetro

		if (s.length() == 0) {
			return s;
		}
		if (p != 0) {
			return s.charAt(0) + eliminarAPartir(resto(s), p-1, c);
		}
		if (s.charAt(0) == c) {	
			return eliminarAPartir(resto(s), p, c);
		}	
		return s.charAt(0) + eliminarAPartir(resto(s), p, c);
	}
	
	
	public static boolean seLeeEn (String s1, String s2) {  // compara dos strings y devuelve true si el string s1 se puede leer dentro del string s2
		
		if (s1.length() == 0) {
			return true;
		}
		if (s2.length() == 0 && s1.length() != 0) {
			return false;
		}
		if (s1.charAt(0) == s2.charAt(0)) {
			return seLeeEn(resto(s1), resto(s2));
		}
		else {
			return seLeeEn(s1,resto(s2));
		}
	}
	
	
	public static String desordenarLetras(String s1) { // desordena las letras según sean vocales o consonantes
		
		if (s1.length() == 0 ) {
			return s1;
		}
		if (esVocal(s1.charAt(0))) {
			return desordenarLetras(resto(s1)) + s1.charAt(0);
		}
		else {
			return s1.charAt(0) + desordenarLetras(resto(s1));
		}
	}
	
	public static String repetirChar(String s, char c, int n) {  // recorre el string y en caso de encontrar el char c, se lo agrega a la cadena n cantidad de veces
		
		int aux;
		
		if (s.length() == 0) {
			return s;
		}
		if ((s.charAt(0) == c) && (n > 1)) {
			return s.charAt(0) + repetirChar(s, c, n-1);
		}
		else {
			return s.charAt(0) + repetirChar(resto(s), c, n);
		}
	}
	
	public static String eliminarVocalesRodeadasPorConsonantes(String s) { // recorre un string y elimina las vocales que estén rodeadas por consonantes
		
		if (s.length() == 0) {
			return s;
		}
		if (s.length() > 2) {
			if (esVocal(s.charAt(0)) == false && (esVocal(s.charAt(2)) == false)) {
				return s.charAt(0) + eliminarVocalesRodeadasPorConsonantes(resto(resto(s))) ; 
			}
		}
		return s.charAt(0) + eliminarVocalesRodeadasPorConsonantes(resto(s));
	}
	
	public static String laMar(String s) { // reemplaza las vocales por la letra A
		String aux = "";
		if (s.length() == 0) {
			return s;
		}
		if (esVocal(s.charAt(0))) {
			return 'a' + laMar(resto(s));
		}
		aux += s.charAt(0);
		return aux + s.charAt(0) + laMar(resto(s));
	}
	
	public static String repetirLetras(String s) {  // repite las letras que sean vocales y estén seguidas por otra vocal
		String aux = "";
		if (s.length() == 0) {
			return s;
		}
		if (s.length() > 1) {
			if (esVocal(s.charAt(0)) && esVocal(s.charAt(1))) {
				aux += s.charAt(0);
				return aux + s.charAt(0) + repetirLetras(resto(s));
			}
			if (esVocal(s.charAt(0)) == false && esVocal(s.charAt(1)) == false) {
				aux += s.charAt(0);
				return aux + aux + s.charAt(0) + repetirLetras(resto(s));
			}
		}
		return s.charAt(0) + repetirLetras(resto(s));
	}
	
	public static String reemplazarLugaresCons(String s, String t) { // recorre ambos strings y si la letra comparada  del string s es una vocal, se 
																	// la reemplaza por la letra de la misma posicion del string t
		if (s.length() == 0) {
			return s;
		}
		if (t.length() != 0) {
			if (esVocal(t.charAt(0)) == false) {
				return t.charAt(0) + reemplazarLugaresCons(resto(s), resto(t));
			}
			else {
				return s.charAt(0) + reemplazarLugaresCons(resto(s), resto(t));
			}
		}
		return s.charAt(0) + reemplazarLugaresCons(resto(s), t); 
	}
	
		
	public static String resto(String s) { // resta el primer caracter a un string (para irlo recorriendo)
		
		String nueva = "";
			
		for (int i = 1; i < s.length(); i++) {
			nueva += s.charAt(i);
			}
		return nueva;
	}
	
	
	public static boolean esVocal(char c) { // chequea si el caracter pasado como parámetro es vocal o no

		if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) { 
			return true;
		}
		else {
			return false;
		}
	}
	
}