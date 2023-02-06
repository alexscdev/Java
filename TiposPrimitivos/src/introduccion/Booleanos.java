package introduccion;

public class Booleanos {
	public static void main (String [] args) {
		int m=2, n=5;
		boolean res;
		res =m > n && m >= n; //res=false
		res =! (m<n || m!= n);
		System.out.println(res);
	}
}
