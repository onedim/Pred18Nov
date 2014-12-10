
public class Zbrajanje_i_Prosjek {

	public static void main(String[] args) {
		double suma=0;
		int n = 0;
		
		double unos = TextIO.getlnDouble();
		
		while (unos !=0){
			suma=suma+unos;
			n=n+1;
			
			unos=TextIO.getDouble();
			
		}
		if (n==0) {
			System.out.println("Morate unjeti bar jedan broj koji je razlicit od nule");
		}
		else {
			System.out.printf("Prosjek je: %f", suma / n );
		}
	}
	
}
